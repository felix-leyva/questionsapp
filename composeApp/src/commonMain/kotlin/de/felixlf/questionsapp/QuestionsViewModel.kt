package de.felixlf.questionsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.felixlf.questionsapp.data.QuestionsProvider
import de.felixlf.questionsapp.domain.Question
import de.felixlf.questionsapp.persistence.QuestionsPersistenceRepository
import de.felixlf.questionsapp.persistence.usecases.GenerateUserProgress
import de.felixlf.questionsapp.persistence.usecases.QuestionSelectionStrategy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class QuestionsViewModel(
    questionsProvider: QuestionsProvider,
    private val persistenceRepository: QuestionsPersistenceRepository,
    private val generateUserProgress: GenerateUserProgress,
    private val questionSelectionStrategy: QuestionSelectionStrategy
) : ViewModel() {

    private val allQuestions = questionsProvider.getQuestions()
        .map { questions -> questions.associateBy { it.hashCode() } }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap())

    private val currentQuestion = MutableStateFlow<Question?>(null)
    private val currentAnswers = MutableStateFlow<List<Question.Answer>>(emptyList())
    private val showSolution = MutableStateFlow(false)
    private val loading = MutableStateFlow(true)
    private val sessionCorrectAnswers = MutableStateFlow(0)
    private val sessionAnswers = MutableStateFlow(0)

    private val userProgress = combine(
        persistenceRepository.questionsData,
        allQuestions.map { it.size },
        sessionAnswers,
        sessionCorrectAnswers,
        generateUserProgress::invoke
    )

    val state: StateFlow<QuestionsUIState> = combine(
        allQuestions,
        currentQuestion,
        currentAnswers,
        showSolution,
        loading,
        userProgress,
        ::QuestionsUIState
    ).onStart { setNewQuestion() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), QuestionsUIState.initial)

    fun setNewQuestion() = viewModelScope.launch {
        loading.value = true
        state.first { it.allQuestions.isNotEmpty() }
        showSolution.value = false

        val allQuestionHashes = state.value.allQuestions.keys
        val questionsData = persistenceRepository.questionsData.first()

        val availableQuestions = questionSelectionStrategy.getAvailableQuestions(
            allQuestionHashes,
            questionsData
        )

        val selectedQuestionHash = questionSelectionStrategy.selectNextQuestion(
            availableQuestions,
            questionsData
        )

        val selectedQuestion = selectedQuestionHash?.let { hash ->
            state.value.allQuestions[hash]
        }

        if (selectedQuestion != null) {
            // Mark question as shown in persistence
            persistenceRepository.markQuestionShown(selectedQuestion.hashCode())

            currentQuestion.value = selectedQuestion
            val shuffledAnswers =
                selectedQuestion.answers.shuffled().map { it.copy(correct = false) }
            currentAnswers.value = shuffledAnswers
        } else {
            // No more questions available
            currentQuestion.value = null
            currentAnswers.value = emptyList()
        }

        loading.value = false
    }

    fun setAnswer(answer: Question.Answer) {
        currentAnswers.value = state.value.currentAnswers.map { currentAnswer ->
            when (currentAnswer.description) {
                answer.description -> answer
                else -> currentAnswer
            }
        }
    }

    fun submitAnswer(userAnswers: List<Question.Answer>) = viewModelScope.launch {
        val currentQuestion = state.value.currentQuestion ?: return@launch
        sessionAnswers.value += 1
        showSolution.value = true

        val isCorrect = currentQuestion.checkIfSubmittedAnswersAreCorrect(userAnswers)

        if (isCorrect) {
            sessionCorrectAnswers.value += 1
        }

        persistenceRepository.markQuestionAnswered(currentQuestion.hashCode(), isCorrect)
    }
}
