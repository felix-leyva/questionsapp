package de.felixlf.questionsapp.persistence.usecases

import de.felixlf.questionsapp.persistence.models.QuestionsData
import de.felixlf.questionsapp.persistence.models.UserProgress
import kotlin.time.ExperimentalTime

fun interface GenerateUserProgress {
    operator fun invoke(questionsData: QuestionsData, totalQuestions: Int, sessionCorrectAnswers: Int): UserProgress
}
@OptIn(ExperimentalTime::class)
class GenerateUserProgressImpl : GenerateUserProgress {
    override operator fun invoke(questionsData: QuestionsData, totalQuestions: Int, sessionCorrectAnswers: Int): UserProgress {
        val allStats = questionsData.questionStats.values
        
        val totalAnswered = allStats.sumOf { it.timesShown }
        val totalShown = allStats.count { it.timesShown > 0 }
        
        return UserProgress(
            answeredQuestions = totalAnswered,
            correctAnswers = sessionCorrectAnswers, // Use session-specific correct answers that reset on app start
            shownQuestions = totalShown,
            totalQuestions = totalQuestions,
            totalSessionTime = 0L, // Not tracking time for now
            lastUpdated = kotlin.time.Clock.System.now().toEpochMilliseconds()
        )
    }
}