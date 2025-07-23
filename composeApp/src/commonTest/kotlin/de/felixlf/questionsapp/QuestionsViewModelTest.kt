package de.felixlf.questionsapp

import app.cash.turbine.test
import de.felixlf.questionsapp.data.QuestionsProvider
import de.felixlf.questionsapp.domain.Question
import de.felixlf.questionsapp.persistence.FakeQuestionsPersistenceRepository
import de.felixlf.questionsapp.persistence.usecases.DefaultQuestionSelectionStrategy
import de.felixlf.questionsapp.persistence.usecases.GenerateUserProgressImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class QuestionsViewModelTest {
    private lateinit var dispatcher: TestDispatcher

    @BeforeTest
    fun setup() {
        dispatcher = UnconfinedTestDispatcher()
        Dispatchers.setMain(dispatcher)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
    }

    private fun questionsProvider(questions: List<Question>) = QuestionsProvider {
        flowOf(questions)
    }

    private fun trackedQuestionsProvider() = FakeQuestionsPersistenceRepository()

    @Test
    fun testSelectRandomQuestion() = runTest(dispatcher) {
        // Given
        val questions = listOf(
            Question("Question 1", listOf(Question.Answer("Answer 1", true))),
            Question("Question 2", listOf(Question.Answer("Answer 2", false))),
            Question("Question 3", listOf(Question.Answer("Answer 3", false))),
            Question("Question 4", listOf(Question.Answer("Answer 4", true))),
            Question("Question 5", listOf(Question.Answer("Answer 5", true))),
        )

        // When
        val viewModel = QuestionsViewModel(
            questionsProvider(questions),
            FakeQuestionsPersistenceRepository(),
            GenerateUserProgressImpl(),
            DefaultQuestionSelectionStrategy()
        )
        viewModel.state.test {
            awaitItem()
            val initial = awaitItem()
            assertTrue { initial.currentQuestion in questions }
        }
        // Then
    }


    @Test
    fun testSelectNewRandomQuestion() = runTest(dispatcher) {
        // Given
        val questions = listOf(
            Question("Question 1", listOf(Question.Answer("Answer 1", true))),
            Question("Question 2", listOf(Question.Answer("Answer 2", false))),
            Question("Question 3", listOf(Question.Answer("Answer 3", false))),
            Question("Question 4", listOf(Question.Answer("Answer 4", true))),
            Question("Question 5", listOf(Question.Answer("Answer 5", true))),
        )
        val viewModel = QuestionsViewModel(
            questionsProvider(questions),
            FakeQuestionsPersistenceRepository(),
            GenerateUserProgressImpl(),
            DefaultQuestionSelectionStrategy()
        )

        // When Then
        viewModel.state.test {
            awaitItem()
            viewModel.setNewQuestion()
            val initial = awaitItem()
            assertTrue { initial.currentQuestion in questions }
            cancelAndIgnoreRemainingEvents()
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun testSubmitAnswer() = runTest(dispatcher) {
        // Given
        val questions = listOf(
            Question("Question 1", listOf(Question.Answer("Answer 1", true))),
            Question("Question 2", listOf(Question.Answer("Answer 2", false))),
            Question("Question 3", listOf(Question.Answer("Answer 3", false))),
            Question("Question 4", listOf(Question.Answer("Answer 4", true))),
            Question("Question 5", listOf(Question.Answer("Answer 5", true))),
        )
        val viewModel = QuestionsViewModel(
            questionsProvider(questions),
            FakeQuestionsPersistenceRepository(),
            GenerateUserProgressImpl(),
            DefaultQuestionSelectionStrategy()
        )
        // When

        viewModel.state.test {
            awaitItem()
            val initial = awaitItem()
            assertTrue { initial.currentQuestion in questions }
            val currentQuestion = viewModel.state.value.currentQuestion!!
            viewModel.submitAnswer(currentQuestion.answers)
            awaitItem()
            val newState = awaitItem()
            assertTrue { newState.showSolution }
            assertEquals(1, newState.correctAnswers)
        }
    }

    @Test
    fun testSubmitAnswerFalse() = runTest(dispatcher) {
        // Given
        val questions = listOf(
            Question("Question 1", listOf(Question.Answer("Answer 1", true))),
            Question("Question 2", listOf(Question.Answer("Answer 2", false))),
            Question("Question 3", listOf(Question.Answer("Answer 3", false))),
            Question("Question 4", listOf(Question.Answer("Answer 4", true))),
            Question("Question 5", listOf(Question.Answer("Answer 5", true))),
        )
        val viewModel = QuestionsViewModel(
            questionsProvider(questions),
            FakeQuestionsPersistenceRepository(),
            GenerateUserProgressImpl(),
            DefaultQuestionSelectionStrategy()
        )

        // When
        viewModel.state.test {
            awaitItem()
            val initial = awaitItem()
            assertTrue { initial.currentQuestion in questions }
            val currentQuestion = initial.currentQuestion!!
            viewModel.submitAnswer(currentQuestion.answers.map { it.copy(correct = it.correct.not()) })
            awaitItem()
            // Then
            assertEquals(0, viewModel.state.value.correctAnswers)
            assertTrue { viewModel.state.value.showSolution }
            cancelAndIgnoreRemainingEvents()
        }
    }

}