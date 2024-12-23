package de.felixlf.questionsapp

import de.felixlf.questionsapp.domain.Question

data class QuestionsUIState(
    val allQuestions: Map<Int, Question>,
    val currentQuestion: Question?,
    val currentAnswers: List<Question.Answer>,
    val showSolution: Boolean,
    val loading: Boolean,
    val answeredQuestions: Int,
    val correctAnswers: Int
) {
    companion object {
        val initial = QuestionsUIState(
            allQuestions = emptyMap(),
            currentQuestion = null,
            currentAnswers = emptyList(),
            showSolution = false,
            loading = true,
            answeredQuestions = 0,
            correctAnswers = 0
        )
    }
}