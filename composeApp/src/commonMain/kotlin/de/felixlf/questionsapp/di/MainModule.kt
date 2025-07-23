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
import de.felixlf.questionsapp.persistence.di.persistenceModule
import de.felixlf.questionsapp.persistence.di.platformPersistenceModule
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.binds
import org.koin.dsl.module

@OptIn(ExperimentalSettingsApi::class)
val mainModule = module {
    includes(
        getPlatformModule(),
        dbModule,
        persistenceModule,
        platformPersistenceModule
    )

    single<SuspendSettings> { Settings().toSuspendSettings() }
    singleOf(::QuestionsProviderImpl) binds arrayOf(
        QuestionsProvider::class,
        TrackedQuetionsService::class
    )
    factory { 
        QuestionsViewModel(
            questionsProvider = get(),
            persistenceRepository = get(),
            generateUserProgress = get(),
            questionSelectionStrategy = get()
        )
    }
}