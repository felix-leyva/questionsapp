package de.felixlf.questionsapp.persistence.models

import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
@OptIn(ExperimentalTime::class)
data class QuestionsData(
    val questionStats: Map<Int, QuestionStats> = emptyMap()
) {
    fun getQuestionStats(questionHash: Int): QuestionStats? {
        return questionStats[questionHash]
    }
    
    fun getTimesShown(questionHash: Int): Int {
        return questionStats[questionHash]?.timesShown ?: 0
    }
    
    fun markQuestionShown(questionHash: Int): QuestionsData {
        val currentStats = questionStats[questionHash] ?: QuestionStats(questionHash)
        val updatedStats = currentStats.copy(
            timesShown = currentStats.timesShown + 1,
            lastShownTimestamp = kotlin.time.Clock.System.now().toEpochMilliseconds()
        )
        return copy(questionStats = questionStats + (questionHash to updatedStats))
    }
    
    fun markQuestionAnswered(questionHash: Int, isCorrect: Boolean): QuestionsData {
        val currentStats = questionStats[questionHash] ?: QuestionStats(questionHash)
        val updatedStats = currentStats.copy(
            timesAnsweredCorrectly = if (isCorrect) currentStats.timesAnsweredCorrectly + 1 else currentStats.timesAnsweredCorrectly,
            lastAnsweredTimestamp = kotlin.time.Clock.System.now().toEpochMilliseconds()
        )
        return copy(questionStats = questionStats + (questionHash to updatedStats))
    }
}