package de.felixlf.questionsapp.persistence.di

import de.felixlf.questionsapp.persistence.KStoreProvider
import de.felixlf.questionsapp.persistence.KStoreQuestionsPersistenceRepository
import de.felixlf.questionsapp.shared.persistence.QuestionsPersistenceRepository
import de.felixlf.questionsapp.shared.persistence.usecases.GenerateUserProgress
import de.felixlf.questionsapp.shared.persistence.usecases.GenerateUserProgressImpl
import de.felixlf.questionsapp.shared.persistence.usecases.QuestionSelectionStrategy
import de.felixlf.questionsapp.shared.persistence.usecases.DefaultQuestionSelectionStrategy
import org.koin.dsl.module

val persistenceModule = module {
    single<GenerateUserProgress> { GenerateUserProgressImpl() }
    single<QuestionSelectionStrategy> { DefaultQuestionSelectionStrategy() }
    single<QuestionsPersistenceRepository> { 
        KStoreQuestionsPersistenceRepository(
            store = get<KStoreProvider>().provideQuestionsDataStore()
        )
    }
}