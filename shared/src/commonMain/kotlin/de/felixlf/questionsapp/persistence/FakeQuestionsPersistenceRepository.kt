package de.felixlf.questionsapp.persistence

import de.felixlf.questionsapp.persistence.models.QuestionsData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class FakeQuestionsPersistenceRepository : QuestionsPersistenceRepository {

    override val questionsData: MutableStateFlow<QuestionsData> = MutableStateFlow(
        QuestionsData()
    )

    override suspend fun markQuestionShown(questionHash: Int) {
        questionsData.update { currentData ->
            currentData.markQuestionShown(questionHash)
        }
    }

    override suspend fun markQuestionAnswered(questionHash: Int, isCorrect: Boolean) {
        questionsData.update { currentData ->
            currentData.markQuestionAnswered(questionHash, isCorrect)
        }
    }

    override suspend fun getTimesShown(questionHash: Int): Int {
        val currentData = questionsData.value
        return currentData.getTimesShown(questionHash)
    }

    override suspend fun clearAllData() {
        questionsData.update { QuestionsData() }
    }
}