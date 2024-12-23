package de.felixlf.questionsapp

import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.coroutines.SuspendSettings
import de.felixlf.questionsapp.domain.Question
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.jetbrains.compose.resources.ExperimentalResourceApi
import questionsapp.composeapp.generated.resources.Res

fun interface QuestionsProvider {
    fun getQuestions(): Flow<List<Question>>
}

fun interface TrackedQuestionsProvider {
    suspend fun getTrackedQuestions(hash: Int): Int?
}

fun interface TrackedQuestionsUpdater {
    suspend fun upsertTrackedQuestion(hash: Int, count: Int)
}

interface TrackedQuetionsService : TrackedQuestionsProvider, TrackedQuestionsUpdater

@OptIn(ExperimentalSettingsApi::class)
class QuestionsProviderImpl(
    private val settings: SuspendSettings
) : QuestionsProvider, TrackedQuetionsService {
    @OptIn(ExperimentalResourceApi::class)
    override fun getQuestions(): Flow<List<Question>> = flow {
        val questionsFile = Res.readBytes("files/questions.md").decodeToString()
        emit(MdReader().readMd(questionsFile))
    }

    override suspend fun getTrackedQuestions(hash: Int): Int? {
        return settings.getIntOrNull(hash.toString())
    }

    override suspend fun upsertTrackedQuestion(hash: Int, count: Int) {
        val currentCount = (settings.getIntOrNull(hash.toString()) ?: 0) + count
        settings.putInt(hash.toString(), currentCount)
    }
}
