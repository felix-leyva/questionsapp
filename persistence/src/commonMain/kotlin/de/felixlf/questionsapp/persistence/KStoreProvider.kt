package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore

expect class KStoreProvider {
    fun provideQuestionsDataStore(): KStore<QuestionsData>
}