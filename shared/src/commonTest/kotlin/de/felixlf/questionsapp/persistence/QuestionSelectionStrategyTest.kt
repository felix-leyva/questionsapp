package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.persistence.models.QuestionStats
import de.felixlf.questionsapp.persistence.models.QuestionsData
import de.felixlf.questionsapp.persistence.usecases.DefaultQuestionSelectionStrategy
import de.felixlf.questionsapp.persistence.usecases.QuestionSelectionConfig
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class QuestionSelectionStrategyTest {

    private val config = QuestionSelectionConfig(
        maxCorrectAnswersBeforeHiding = 3,
        highPriorityCorrectThreshold = 0.3,
        mediumPriorityCorrectThreshold = 0.7,
        minimumAttemptsForPrioritization = 2
    )
    
    private val strategy = DefaultQuestionSelectionStrategy(config)

    @Test
    fun `getAvailableQuestions excludes questions answered correctly too many times`() {
        val allQuestions = setOf(1, 2, 3, 4)
        val questionsData = QuestionsData(
            questionStats = mapOf(
                1 to QuestionStats(1, timesShown = 5, timesAnsweredCorrectly = 3), // Should be excluded
                2 to QuestionStats(2, timesShown = 3, timesAnsweredCorrectly = 2), // Should be included
                3 to QuestionStats(3, timesShown = 2, timesAnsweredCorrectly = 1), // Should be included
                // Question 4 has no stats, should be included
            )
        )
        
        val result = strategy.getAvailableQuestions(allQuestions, questionsData)
        
        assertEquals(setOf(2, 3, 4), result.toSet())
    }

    @Test
    fun `calculatePriority returns 100 for new questions`() {
        val priority = strategy.calculatePriority(null)
        assertEquals(100, priority)
    }

    @Test
    fun `calculatePriority returns 90 for difficult questions`() {
        val questionStats = QuestionStats(1, timesShown = 5, timesAnsweredCorrectly = 1) // 20% success rate
        val priority = strategy.calculatePriority(questionStats)
        assertEquals(90, priority)
    }

    @Test
    fun `calculatePriority returns 70 for medium difficulty questions`() {
        val questionStats = QuestionStats(1, timesShown = 5, timesAnsweredCorrectly = 2) // 40% success rate
        val priority = strategy.calculatePriority(questionStats)
        assertEquals(70, priority)
    }

    @Test
    fun `calculatePriority returns 30 for easy questions`() {
        val questionStats = QuestionStats(1, timesShown = 5, timesAnsweredCorrectly = 4) // 80% success rate
        val priority = strategy.calculatePriority(questionStats)
        assertEquals(30, priority)
    }

    @Test
    fun `selectNextQuestion returns null for empty list`() {
        val result = strategy.selectNextQuestion(emptyList(), QuestionsData())
        assertEquals(null, result)
    }

    @Test
    fun `selectNextQuestion returns single question when only one available`() {
        val availableQuestions = listOf(42)
        val result = strategy.selectNextQuestion(availableQuestions, QuestionsData())
        assertEquals(42, result)
    }

    @Test
    fun `selectNextQuestion returns a valid question from multiple options`() {
        val availableQuestions = listOf(1, 2, 3)
        val questionsData = QuestionsData()
        
        val result = strategy.selectNextQuestion(availableQuestions, questionsData)
        
        assertTrue(result in availableQuestions)
    }
}