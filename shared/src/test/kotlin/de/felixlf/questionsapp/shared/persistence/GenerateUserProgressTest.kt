package de.felixlf.questionsapp.shared.persistence

import de.felixlf.questionsapp.shared.persistence.models.QuestionStats
import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import de.felixlf.questionsapp.shared.persistence.usecases.GenerateUserProgressImpl
import kotlin.test.Test
import kotlin.test.assertEquals

class GenerateUserProgressTest {

    private val generateUserProgress = GenerateUserProgressImpl()

    @Test
    fun `generateUserProgress returns empty progress for empty data`() {
        val questionsData = QuestionsData()
        
        val result = generateUserProgress(questionsData)
        
        assertEquals(0, result.answeredQuestions)
        assertEquals(0, result.correctAnswers)
        assertEquals(0.0, result.correctAnswerRate)
    }

    @Test
    fun `generateUserProgress calculates correct totals`() {
        val questionsData = QuestionsData(
            questionStats = mapOf(
                1 to QuestionStats(1, timesShown = 3, timesAnsweredCorrectly = 2),
                2 to QuestionStats(2, timesShown = 2, timesAnsweredCorrectly = 1),
                3 to QuestionStats(3, timesShown = 1, timesAnsweredCorrectly = 1)
            )
        )
        
        val result = generateUserProgress(questionsData)
        
        assertEquals(6, result.answeredQuestions) // 3 + 2 + 1
        assertEquals(4, result.correctAnswers)   // 2 + 1 + 1
        assertEquals(4.0 / 6.0, result.correctAnswerRate)
    }

    @Test
    fun `generateUserProgress handles all incorrect answers`() {
        val questionsData = QuestionsData(
            questionStats = mapOf(
                1 to QuestionStats(1, timesShown = 2, timesAnsweredCorrectly = 0),
                2 to QuestionStats(2, timesShown = 3, timesAnsweredCorrectly = 0)
            )
        )
        
        val result = generateUserProgress(questionsData)
        
        assertEquals(5, result.answeredQuestions)
        assertEquals(0, result.correctAnswers)
        assertEquals(0.0, result.correctAnswerRate)
    }
}