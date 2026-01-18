package de.felixlf.questionsapp

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.felixlf.questionsapp.domain.Question
import de.felixlf.questionsapp.ui.QuestionContent
import de.felixlf.questionsapp.ui.StatsHeader
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    val colorScheme = when {
        isSystemInDarkTheme() -> darkColorScheme()
        else -> lightColorScheme()
    }
    MaterialTheme(
        colorScheme = colorScheme
    ) {
        Scaffold {
            val viewModel = koinViewModel<QuestionsViewModel>()
            val state by viewModel.state.collectAsStateWithLifecycle()
            QuestionsScreen(
                modifier = Modifier.padding(it).safeContentPadding(),
                state = state,
                onAnswerToggle = { answer -> viewModel.setAnswer(answer) },
                onSubmit = { viewModel.submitAnswer(state.currentAnswers) },
                onNext = { viewModel.setNewQuestion() },
            )
        }
    }
}

@Composable
internal fun QuestionsScreen(
    modifier: Modifier = Modifier,
    state: QuestionsUIState,
    onAnswerToggle: (Question.Answer) -> Unit = {},
    onSubmit: () -> Unit = {},
    onNext: () -> Unit = {},
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .widthIn(max = 800.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val animatedAlpha by animateFloatAsState(targetValue = if (state.loading) 0.0f else 1f)
        Column(modifier = Modifier.fillMaxWidth()){}

        StatsHeader(
            shownQuestions = state.shownQuestions,
            totalQuestions = state.totalQuestions,
            correctAnswers = state.correctAnswers,
            correctAnswerPercentage = state.userProgress.correctAnswerSessionPercentage
        )

        state.currentQuestion?.let { question ->
            QuestionContent(
                question = question,
                currentAnswers = state.currentAnswers,
                showSolution = state.showSolution,
                animatedAlpha = animatedAlpha,
                onAnswerToggle = onAnswerToggle,
                onSubmit = onSubmit,
                onNext = onNext,
            )
        }
    }
}