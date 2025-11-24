package de.felixlf.questionsapp.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import de.felixlf.questionsapp.domain.Question

@Composable
internal fun AnswerCard(
    answer: Question.Answer,
    baseAnswer: Question.Answer,
    showSolution: Boolean,
    onAnswerToggle: (Question.Answer) -> Unit
) {
    val correct = when {
        showSolution -> baseAnswer.correct == answer.correct
        else -> null
    }
    val backgroundColor = when (correct) {
        true -> Color.Green.copy(alpha = 0.2f)
        false -> Color.Red.copy(alpha = 0.2f)
        else -> MaterialTheme.colorScheme.surface
    }

    Card(
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            .clickable {
                if (!showSolution) onAnswerToggle(answer.copy(correct = !answer.correct))
            },
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (showSolution) {
                RadioButton(selected = baseAnswer.correct, onClick = { })
            }
            RadioButton(
                selected = answer.correct,
                onClick = {
                    if (!showSolution) {
                        onAnswerToggle(answer.copy(correct = !answer.correct))
                    }
                }
            )
            Text(text = answer.description)
        }
    }
}