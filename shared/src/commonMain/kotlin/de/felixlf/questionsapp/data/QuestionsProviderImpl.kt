package de.felixlf.questionsapp.data

import de.felixlf.questionsapp.domain.Question
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.jetbrains.compose.resources.ExperimentalResourceApi
import questionsapp.shared.generated.resources.Res

fun interface QuestionsProvider {
    fun getQuestions(): Flow<List<Question>>
}

class QuestionsProviderImpl(
    private val mdReader: MdReader = MdReader(),
) : QuestionsProvider {
    @OptIn(ExperimentalResourceApi::class)
    override fun getQuestions(): Flow<List<Question>> = flow {
        val questionsFile = Res.readBytes("files/questions.md").decodeToString()
        emit(mdReader.readMd(questionsFile))
    }
}