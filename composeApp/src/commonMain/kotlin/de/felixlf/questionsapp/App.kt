package de.felixlf.questionsapp

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<QuestionsViewModel>()
        val state by viewModel.state.collectAsStateWithLifecycle()
        val animatedAlpha by animateFloatAsState(targetValue = if (state.loading) 0.0f else 1f)

        Column(
            Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Questions shown: ${state.shownQuestions} / ${state.totalQuestions}")
            Text(text = "Remaining questions: ${state.remainingQuestions}")
            Text(text = "Questions answered: ${state.answeredQuestions}")
            val percentage = if (state.answeredQuestions > 0) {
                (state.correctAnswers.toFloat() / state.answeredQuestions * 100).toInt()
            } else 0
            Text(text = "Session correct answers: ${state.correctAnswers} (${percentage}%)")
            Spacer(modifier = Modifier.padding(16.dp))
            state.currentQuestion?.let { question ->
                Text(text = question.question, style = MaterialTheme.typography.h6)
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()).alpha(animatedAlpha)
                ) {
                    state.currentAnswers.forEach { answer ->
                        val baseAnswer = question.answers.first { it.description == answer.description }
                        val correct = when {
                            state.showSolution -> baseAnswer.correct == answer.correct
                            else -> null
                        }
                        val backgroundColor = when (correct) {
                            true -> Color.Green.copy(alpha = 0.2f)
                            false -> Color.Red.copy(alpha = 0.2f)
                            else -> MaterialTheme.colors.surface
                        }
                        Card(
                            backgroundColor = backgroundColor,
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp).clickable {
                                if (!state.showSolution) viewModel.setAnswer(answer.copy(correct = !answer.correct))
                            },
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                if (state.showSolution) {
                                    RadioButton(selected = baseAnswer.correct, onClick = { })
                                }
                                RadioButton(
                                    selected = answer.correct,
                                    onClick = {
                                        if (!state.showSolution) {
                                            viewModel.setAnswer(
                                                answer.copy(correct = !answer.correct)
                                            )
                                        }
                                    }
                                )
                                Text(text = answer.description)
                            }
                        }
                    }

                    Button(modifier = Modifier.align(Alignment.CenterHorizontally), onClick = {
                        if (state.showSolution) {
                            viewModel.setNewQuestion()
                        } else {
                            viewModel.submitAnswer(state.currentAnswers)
                        }
                    }) {
                        val text = if (state.showSolution) "Next Question" else "Submit Answer"
                        Text(text)
                    }
                }
            }
        }
    }
}
