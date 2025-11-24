package de.felixlf.questionsapp.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun StatsHeader(
    shownQuestions: Int,
    totalQuestions: Int,
    correctAnswers: Int,
    correctAnswerPercentage: Int
) {
    Text(text = "Questions shown: $shownQuestions / $totalQuestions")
    Text(text = "Session correct answers: $correctAnswers ($correctAnswerPercentage%)")
    Spacer(modifier = Modifier.padding(16.dp))
}