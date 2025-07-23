package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.file.storeOf
import kotlinx.io.files.Path
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSSearchPathForDirectoriesInDomains
import platform.Foundation.NSUserDomainMask

actual class KStoreProvider {
    actual fun provideQuestionsDataStore(): KStore<QuestionsData> {
        val documentDirectory = NSSearchPathForDirectoriesInDomains(
            NSDocumentDirectory, NSUserDomainMask, true
        ).first() as String
        
        return storeOf(
            file = Path("$documentDirectory/questions_data.json"),
            default = QuestionsData()
        )
    }
}