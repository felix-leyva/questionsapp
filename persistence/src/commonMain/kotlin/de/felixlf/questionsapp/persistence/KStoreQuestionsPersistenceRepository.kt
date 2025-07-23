package de.felixlf.questionsapp.persistence


import de.felixlf.questionsapp.shared.persistence.QuestionsPersistenceRepository
import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import io.github.xxfast.kstore.KStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class KStoreQuestionsPersistenceRepository(
    private val store: KStore<QuestionsData>
) : QuestionsPersistenceRepository {

    override val questionsData: Flow<QuestionsData> = store.updates.map { it ?: QuestionsData() }

    override suspend fun markQuestionShown(questionHash: Int) {
        store.update { currentData ->
            (currentData ?: QuestionsData()).markQuestionShown(questionHash)
        }
    }

    override suspend fun markQuestionAnswered(questionHash: Int, isCorrect: Boolean) {
        store.update { currentData ->
            (currentData ?: QuestionsData()).markQuestionAnswered(questionHash, isCorrect)
        }
    }

    override suspend fun getTimesShown(questionHash: Int): Int {
        val currentData = store.get() ?: QuestionsData()
        return currentData.getTimesShown(questionHash)
    }

    override suspend fun clearAllData() {
        store.delete()
    }
}