package de.felixlf.questionsapp.di

import de.felixlf.questionsapp.QuestionsViewModel
import de.felixlf.questionsapp.persistence.di.persistenceModule
import de.felixlf.questionsapp.persistence.di.platformPersistenceModule
import de.felixlf.questionsapp.data.MdReader
import de.felixlf.questionsapp.data.QuestionsProvider
import de.felixlf.questionsapp.data.QuestionsProviderImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.binds
import org.koin.dsl.module

val mainModule = module {
    includes(
        getPlatformModule(),
        persistenceModule,
        platformPersistenceModule
    )
    singleOf(::MdReader)
    singleOf(::QuestionsProviderImpl) binds arrayOf(
        QuestionsProvider::class,
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