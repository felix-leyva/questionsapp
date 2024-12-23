package de.felixlf.questionsapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import de.felixlf.questionsapp.di.mainModule
import org.koin.core.context.startKoin

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "QuestionsApp",
    ) {
        koinSetup()
        App()
    }
}

private fun koinSetup() = startKoin {
    modules(mainModule)
    printLogger()
}

