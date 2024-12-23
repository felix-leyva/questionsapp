package de.felixlf.questionsapp.di

import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.Settings
import com.russhwolf.settings.coroutines.SuspendSettings
import com.russhwolf.settings.coroutines.toSuspendSettings
import de.felixlf.questionsapp.QuestionsProvider
import de.felixlf.questionsapp.QuestionsProviderImpl
import de.felixlf.questionsapp.QuestionsViewModel
import de.felixlf.questionsapp.TrackedQuetionsService
import de.felixlf.questionsapp.data.db.dbModule
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.binds
import org.koin.dsl.module

@OptIn(ExperimentalSettingsApi::class)
val mainModule = module {
    includes(
        getPlatformModule(),
        dbModule
    )

    single<SuspendSettings> { Settings().toSuspendSettings() }
    singleOf(::QuestionsProviderImpl) binds arrayOf(
        QuestionsProvider::class,
        TrackedQuetionsService::class
    )
    factoryOf(::QuestionsViewModel)
}