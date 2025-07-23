package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.file.storeOf
import kotlinx.io.files.Path

actual class KStoreProvider {
    actual fun provideQuestionsDataStore(): KStore<QuestionsData> {
        val userHome = System.getProperty("user.home")
        val appDataDir = "$userHome/.questionsapp"
        return storeOf(
            file = Path("$appDataDir/questions_data.json"),
            default = QuestionsData()
        )
    }
}