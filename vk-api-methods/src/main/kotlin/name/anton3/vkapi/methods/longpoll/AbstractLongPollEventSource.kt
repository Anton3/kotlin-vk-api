package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import name.anton3.vkapi.methods.longpoll.objects.LongPollFailure
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.transport.decodeToString
import name.anton3.vkapi.transport.get
import org.apache.logging.log4j.kotlin.Logging
import java.io.IOException
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.coroutineContext

abstract class AbstractLongPollEventSource<EventType, IteratorType>(
    private val longPollContext: CoroutineContext,
    protected val objectMapper: ObjectMapper,
    protected val transportClient: TransportClient,
    private val responseType: TypeReference<LongPollResponse<EventType>>
) {
    companion object : Logging

    private val shutdown = AtomicBoolean(false)

    abstract suspend fun iteratorToUrl(iterator: IteratorType): String

    abstract suspend fun iteratorWithTs(iterator: IteratorType, ts: Int): IteratorType

    abstract suspend fun iterator(): IteratorType

    suspend fun getEvents(iterator: IteratorType): Pair<IteratorType, List<EventType>> {
        val vkResponse = withContext(longPollContext) {
            transportClient.get(iteratorToUrl(iterator))
        }

        val vkJson = vkResponse.decodeToString()
        logger.debug("VK long poll responds with $vkJson")

        @Suppress("BlockingMethodInNonBlockingContext")
        val lpResponse: LongPollResponse<EventType> = objectMapper.readValue(vkJson, responseType)

        return when (lpResponse.failed) {
            null -> {
                iteratorWithTs(iterator, lpResponse.ts!!.toInt()) to lpResponse.updates
            }
            LongPollFailure.NEW_TS -> {
                logger.debug("LongPoll failed with error 1")
                iteratorWithTs(iterator, lpResponse.ts!!.toInt()) to emptyList()
            }
            LongPollFailure.REQUEST_NEW_KEY -> {
                val newServer = iterator()
                logger.debug("LongPoll failed with error 2")
                newServer to emptyList()
            }
            LongPollFailure.REQUEST_NEW_KEY_TS -> {
                val newServer = iterator()
                logger.debug("LongPoll failed with error 3")
                newServer to emptyList()
            }
            LongPollFailure.INVALID_VERSION -> {
                error("LongPoll failed with error 4: Invalid version")
            }
        }
    }

    fun produceEvents(): Flow<EventType> = flow {
        var iter = iteratorSwallowing()

        while (coroutineContext.isActive) {
            val response = try {
                getEvents(iter)
            } catch (e: IOException) {
                logger.warn("LongPoll error", e)
                iter = iteratorSwallowing()
                continue
            }

            iter = response.first
            if (!coroutineContext.isActive) break

            try {
                response.second.forEach { emit(it) }
            } catch (e: ClosedSendChannelException) {
                break
            }
        }
    }

    private suspend fun iteratorSwallowing(): IteratorType {
        while (true) {
            try {
                return iterator()
            } catch (e: IOException) {
                logger.warn("LongPoll iterator error", e)
            }
        }
    }
}
