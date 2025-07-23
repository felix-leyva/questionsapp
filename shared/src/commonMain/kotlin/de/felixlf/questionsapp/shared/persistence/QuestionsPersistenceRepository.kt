package de.felixlf.questionsapp.shared.persistence

import de.felixlf.questionsapp.shared.persistence.models.QuestionsData
import kotlinx.coroutines.flow.Flow

interface QuestionsPersistenceRepository {
    
    val questionsData: Flow<QuestionsData>
    
    suspend fun markQuestionShown(questionHash: Int)
    
    suspend fun markQuestionAnswered(questionHash: Int, isCorrect: Boolean)
    
    suspend fun getTimesShown(questionHash: Int): Int
    
    suspend fun clearAllData()
}