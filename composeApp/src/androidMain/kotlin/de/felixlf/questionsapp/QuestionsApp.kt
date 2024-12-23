package de.felixlf.questionsapp

import android.app.Application
import de.felixlf.questionsapp.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class QuestionsApp: Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@QuestionsApp)
            androidLogger()
            modules(mainModule)
        }
    }
}