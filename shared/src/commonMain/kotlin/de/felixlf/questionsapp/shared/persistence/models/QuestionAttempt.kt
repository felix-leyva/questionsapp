package de.felixlf.questionsapp.shared.persistence.models

import kotlinx.serialization.Serializable

@Serializable
data class QuestionStats(
    val questionHash: Int,
    val timesShown: Int = 0,
    val timesAnsweredCorrectly: Int = 0,
    val lastShownTimestamp: Long = 0L,
    val lastAnsweredTimestamp: Long = 0L
)