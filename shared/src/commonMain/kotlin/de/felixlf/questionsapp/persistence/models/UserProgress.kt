package de.felixlf.questionsapp.persistence.models

import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
@OptIn(ExperimentalTime::class)
data class UserProgress(
    val answeredQuestions: Int = 0,
    val correctAnswers: Int = 0,
    val shownQuestions: Int = 0,
    val totalQuestions: Int = 0,
    val totalSessionTime: Long = 0L,
    val lastUpdated: Long = kotlin.time.Clock.System.now().toEpochMilliseconds()
) {
    val correctAnswerRate: Double
        get() = if (answeredQuestions > 0) correctAnswers.toDouble() / answeredQuestions else 0.0
    
    val remainingQuestions: Int
        get() = maxOf(0, totalQuestions - shownQuestions)
}