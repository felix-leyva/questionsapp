package de.felixlf.questionsapp.shared.persistence.usecases

import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import de.felixlf.questionsapp.shared.persistence.models.UserProgress
import kotlinx.datetime.Clock

fun interface GenerateUserProgress {
    operator fun invoke(questionsData: QuestionsData, totalQuestions: Int, sessionCorrectAnswers: Int): UserProgress
}

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
            lastUpdated = Clock.System.now().toEpochMilliseconds()
        )
    }
}