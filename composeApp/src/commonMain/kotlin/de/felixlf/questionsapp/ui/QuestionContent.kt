package de.felixlf.questionsapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import de.felixlf.questionsapp.domain.Question

@Composable
internal fun QuestionContent(
    question: Question,
    currentAnswers: List<Question.Answer>,
    showSolution: Boolean,
    animatedAlpha: Float,
    onAnswerToggle: (Question.Answer) -> Unit,
    onSubmit: () -> Unit,
    onNext: () -> Unit
) {
    Text(
        text = question.questionSetName,
        style = MaterialTheme.typography.bodySmall
    )
    Text(text = question.question, style = MaterialTheme.typography.titleMedium)

    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()).alpha(animatedAlpha)
    ) {
        currentAnswers.forEach { answer ->
            val baseAnswer = question.answers.first { it.description == answer.description }
            AnswerCard(
                answer = answer,
                baseAnswer = baseAnswer,
                showSolution = showSolution,
                onAnswerToggle = onAnswerToggle
            )
        }

        ActionButton(
            showSolution = showSolution,
            onSubmit = onSubmit,
            onNext = onNext,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        question.rationale?.let { rationale ->
            if (showSolution) {
                RationaleCard(rationale)
            }
        }
    }
}