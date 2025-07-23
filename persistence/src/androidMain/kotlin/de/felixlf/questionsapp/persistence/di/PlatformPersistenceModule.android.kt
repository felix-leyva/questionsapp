package de.felixlf.questionsapp.persistence.di

import de.felixlf.questionsapp.persistence.KStoreProvider
import org.koin.dsl.module

actual val platformPersistenceModule = module {
    single { KStoreProvider(context = get()) }
}