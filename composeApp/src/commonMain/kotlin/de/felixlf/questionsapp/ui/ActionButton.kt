package de.felixlf.questionsapp.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun ActionButton(
    showSolution: Boolean,
    onSubmit: () -> Unit,
    onNext: () -> Unit,
    modifier: Modifier = Modifier.Companion
) {
    Button(
        modifier = modifier,
        onClick = {
            when {
                showSolution -> onNext()
                else -> onSubmit()
            }
        }
    ) {
        val text = if (showSolution) "Next Question" else "Submit Answer"
        Text(text)
    }
}