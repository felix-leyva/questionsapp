package de.felixlf.questionsapp.shared.persistence

import de.felixlf.questionsapp.shared.persistence.models.QuestionStats
import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class QuestionsDataTest {

    @Test
    fun `getQuestionStats returns null for non-existent question`() {
        val questionsData = QuestionsData()
        assertNull(questionsData.getQuestionStats(123))
    }

    @Test
    fun `getTimesShown returns 0 for non-existent question`() {
        val questionsData = QuestionsData()
        assertEquals(0, questionsData.getTimesShown(123))
    }

    @Test
    fun `markQuestionShown creates new stats for new question`() {
        val questionsData = QuestionsData()
        
        val updated = questionsData.markQuestionShown(123)
        
        val stats = updated.getQuestionStats(123)
        assertEquals(123, stats?.questionHash)
        assertEquals(1, stats?.timesShown)
        assertEquals(0, stats?.timesAnsweredCorrectly)
    }

    @Test
    fun `markQuestionShown increments existing stats`() {
        val initialStats = QuestionStats(123, timesShown = 2, timesAnsweredCorrectly = 1)
        val questionsData = QuestionsData(questionStats = mapOf(123 to initialStats))
        
        val updated = questionsData.markQuestionShown(123)
        
        val stats = updated.getQuestionStats(123)
        assertEquals(3, stats?.timesShown)
        assertEquals(1, stats?.timesAnsweredCorrectly) // Should remain unchanged
    }

    @Test
    fun `markQuestionAnswered correctly increments correct answers`() {
        val initialStats = QuestionStats(123, timesShown = 2, timesAnsweredCorrectly = 1)
        val questionsData = QuestionsData(questionStats = mapOf(123 to initialStats))
        
        val updated = questionsData.markQuestionAnswered(123, isCorrect = true)
        
        val stats = updated.getQuestionStats(123)
        assertEquals(2, stats?.timesShown) // Should remain unchanged
        assertEquals(2, stats?.timesAnsweredCorrectly) // Should increment
    }

    @Test
    fun `markQuestionAnswered does not increment for incorrect answer`() {
        val initialStats = QuestionStats(123, timesShown = 2, timesAnsweredCorrectly = 1)
        val questionsData = QuestionsData(questionStats = mapOf(123 to initialStats))
        
        val updated = questionsData.markQuestionAnswered(123, isCorrect = false)
        
        val stats = updated.getQuestionStats(123)
        assertEquals(2, stats?.timesShown) // Should remain unchanged
        assertEquals(1, stats?.timesAnsweredCorrectly) // Should remain unchanged
    }

    @Test
    fun `markQuestionAnswered creates new stats for new question`() {
        val questionsData = QuestionsData()
        
        val updated = questionsData.markQuestionAnswered(123, isCorrect = true)
        
        val stats = updated.getQuestionStats(123)
        assertEquals(123, stats?.questionHash)
        assertEquals(0, stats?.timesShown)
        assertEquals(1, stats?.timesAnsweredCorrectly)
    }
}