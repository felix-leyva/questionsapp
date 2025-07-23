package de.felixlf.questionsapp.persistence.usecases

import de.felixlf.questionsapp.persistence.models.QuestionStats
import de.felixlf.questionsapp.persistence.models.QuestionsData

interface QuestionSelectionStrategy {
    fun getAvailableQuestions(
        allQuestionHashes: Set<Int>, 
        questionsData: QuestionsData
    ): List<Int>
    
    fun calculatePriority(questionStats: QuestionStats?): Int
    
    fun selectNextQuestion(availableQuestions: List<Int>, questionsData: QuestionsData): Int?
}

class DefaultQuestionSelectionStrategy(
    private val config: QuestionSelectionConfig = QuestionSelectionConfig()
) : QuestionSelectionStrategy {
    
    override fun getAvailableQuestions(
        allQuestionHashes: Set<Int>, 
        questionsData: QuestionsData
    ): List<Int> {
        return allQuestionHashes.filter { questionHash ->
            val stats = questionsData.getQuestionStats(questionHash)
            shouldShowQuestion(stats)
        }
    }
    
    override fun calculatePriority(questionStats: QuestionStats?): Int {
        if (questionStats == null) return 100 // New questions have highest priority
        
        val successRate = if (questionStats.timesShown > 0) {
            questionStats.timesAnsweredCorrectly.toDouble() / questionStats.timesShown
        } else 0.0
        
        return when {
            questionStats.timesShown == 0 -> 100
            successRate < config.highPriorityCorrectThreshold -> 90
            successRate < config.mediumPriorityCorrectThreshold -> 70
            else -> 30
        }
    }
    
    override fun selectNextQuestion(availableQuestions: List<Int>, questionsData: QuestionsData): Int? {
        if (availableQuestions.isEmpty()) return null
        
        val weightedQuestions = availableQuestions.map { hash ->
            val priority = calculatePriority(questionsData.getQuestionStats(hash))
            hash to priority
        }
        
        return selectWeightedRandom(weightedQuestions)
    }
    
    private fun shouldShowQuestion(questionStats: QuestionStats?): Boolean {
        if (questionStats == null) return true
        
        return questionStats.timesAnsweredCorrectly < config.maxCorrectAnswersBeforeHiding
    }
    
    private fun selectWeightedRandom(weightedQuestions: List<Pair<Int, Int>>): Int {
        val totalWeight = weightedQuestions.sumOf { it.second }
        if (totalWeight == 0) return weightedQuestions.random().first
        
        val randomValue = (0 until totalWeight).random()
        var currentWeight = 0
        
        for ((questionHash, weight) in weightedQuestions) {
            currentWeight += weight
            if (randomValue < currentWeight) {
                return questionHash
            }
        }
        
        return weightedQuestions.last().first
    }
}