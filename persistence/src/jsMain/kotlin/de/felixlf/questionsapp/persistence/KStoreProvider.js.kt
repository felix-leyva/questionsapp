package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.storage.storeOf

actual class KStoreProvider {
    actual fun provideQuestionsDataStore(): KStore<QuestionsData> {
        return storeOf(
            key = "questions_data",
            default = QuestionsData()
        )
    }
}