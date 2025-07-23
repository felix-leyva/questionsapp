package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.file.storeOf
import kotlinx.io.files.Path
import java.io.File

actual class KStoreProvider {
    actual fun provideQuestionsDataStore(): KStore<QuestionsData> {
        val userHome = System.getProperty("user.home")
        val appDataDir = File("$userHome/.questionsapp")
        
        // Create the directory if it doesn't exist
        if (!appDataDir.exists()) {
            appDataDir.mkdirs()
        }
        
        return storeOf(
            file = Path("${appDataDir.absolutePath}/questions_data.json"),
            default = QuestionsData()
        )
    }
}