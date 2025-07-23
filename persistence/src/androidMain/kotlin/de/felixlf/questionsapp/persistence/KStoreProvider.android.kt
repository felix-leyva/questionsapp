package de.felixlf.questionsapp.persistence

import android.content.Context
import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.file.storeOf
import kotlinx.io.files.Path

actual class KStoreProvider(private val context: Context) {
    actual fun provideQuestionsDataStore(): KStore<QuestionsData> {
        return storeOf(
            file = Path("${context.filesDir}/questions_data.json"),
            default = QuestionsData()
        )
    }
}