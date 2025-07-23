package de.felixlf.questionsapp

import de.felixlf.questionsapp.domain.Question
import de.felixlf.questionsapp.shared.persistence.models.UserProgress

data class QuestionsUIState(
    val allQuestions: Map<Int, Question>,
    val currentQuestion: Question?,
    val currentAnswers: List<Question.Answer>,
    val showSolution: Boolean,
    val loading: Boolean,
    val userProgress: UserProgress
) {
    val answeredQuestions: Int get() = userProgress.answeredQuestions
    val correctAnswers: Int get() = userProgress.correctAnswers
    val shownQuestions: Int get() = userProgress.shownQuestions
    val totalQuestions: Int get() = userProgress.totalQuestions
    val remainingQuestions: Int get() = userProgress.remainingQuestions
    
    companion object {
        val initial = QuestionsUIState(
            allQuestions = emptyMap(),
            currentQuestion = null,
            currentAnswers = emptyList(),
            showSolution = false,
            loading = true,
            userProgress = UserProgress()
        )
    }
}