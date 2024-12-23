package de.felixlf.questionsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.felixlf.questionsapp.domain.Question
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class QuestionsViewModel(
    questionsProvider: QuestionsProvider,
    private val trackedQuestionsService: TrackedQuetionsService
) : ViewModel() {
    private val allQuestions = questionsProvider.getQuestions()
        .map { questions -> questions.associateBy { it.hashCode() } }

    private val currentQuestion = MutableStateFlow<Question?>(null)
    private val currentAnswers = MutableStateFlow<List<Question.Answer>>(emptyList())
    private val showSolution = MutableStateFlow(false)
    private val answeredQuestions = MutableStateFlow(0)
    private val correctAnswers = MutableStateFlow(0)
    private val loading = MutableStateFlow(false)

    val state = combine(
        allQuestions,
        currentQuestion,
        currentAnswers,
        showSolution,
        loading,
        answeredQuestions,
        correctAnswers,
        ::QuestionsUIState
    ).stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), QuestionsUIState.initial)

    init {
        viewModelScope.launch {
            state.first { !it.loading }
            setNewQuestion()
        }
    }

    fun setNewQuestion() = viewModelScope.launch {
        loading.emit(true)
        delay(500)
        showSolution.value = false

        val availableQuestions =
            state.value.allQuestions.keys.filter { (trackedQuestionsService.getTrackedQuestions(it) ?: 0) < 2 }

        val currentQuestion = if (availableQuestions.isNotEmpty()) {
            val randomKey = availableQuestions.random()
            state.value.allQuestions[randomKey] ?: return@launch
        } else return@launch

        this@QuestionsViewModel.currentQuestion.value = currentQuestion

        val currentAnswers = currentQuestion.answers.shuffled().map { it.copy(correct = false) }
        this@QuestionsViewModel.currentAnswers.value = currentAnswers
        loading.value = false
    }

    fun setAnswer(answer: Question.Answer) {
        currentAnswers.value = state.value.currentAnswers.map {
            when (it.description) {
                answer.description -> answer
                else -> it
            }
        }
    }

    fun submitAnswer(userAnswers: List<Question.Answer>) {
        val currentQuestion = state.value.currentQuestion ?: return
        answeredQuestions.update { it + 1 }
        showSolution.value = true
        if (currentQuestion.checkIfSubmittedAnswersAreCorrect(userAnswers)) viewModelScope.launch {
            correctAnswers.update { it + 1 }
            trackedQuestionsService.upsertTrackedQuestion(currentQuestion.hashCode(), 1)
        }
    }
}
