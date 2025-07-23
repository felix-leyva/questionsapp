package de.felixlf.questionsapp.domain

data class Question(
    val question: String,
    val answers: List<Answer>,
    val rationale: String?,
) {

    fun checkIfSubmittedAnswersAreCorrect(userAnswers: List<Answer>): Boolean {
        if (userAnswers.size != answers.size) return false

        val correctAnswersSet = answers.filter { it.correct }.toSet()
        val userAnswersSet = userAnswers.filter { it.correct }.toSet()

        return correctAnswersSet == userAnswersSet
    }

    data class Answer(
        val description: String,
        val correct: Boolean
    )
}