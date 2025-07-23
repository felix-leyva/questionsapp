package de.felixlf.questionsapp.shared.persistence.usecases

data class QuestionSelectionConfig(
    val maxCorrectAnswersBeforeHiding: Int = 3,
    val highPriorityCorrectThreshold: Double = 0.3,
    val mediumPriorityCorrectThreshold: Double = 0.7,
    val minimumAttemptsForPrioritization: Int = 2
)