package de.felixlf.questionsapp.data

import de.felixlf.questionsapp.BuildQuestionsFiles
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
        val categoryInfo = ResourceIndex.categories[BuildQuestionsFiles.CATEGORY_NAME]
        val allQuestions = categoryInfo?.files?.mapNotNull { fileName ->
            try {
                val filePath = "${categoryInfo.path}/$fileName"
                val fileContent = Res.readBytes(filePath).decodeToString()
                val individualquestions =
                    mdReader.readMd(fileContent, fileName.removeSuffix("-verified.md"), "##")
                individualquestions
            } catch (e: Exception) {
                println("Error reading file: ${categoryInfo.path}/$fileName - ${e.message}")
                null
            }
        }?.flatten() ?: emptyList()

        emit(allQuestions)
    }
}