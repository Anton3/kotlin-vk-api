package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.withContext
import mu.KotlinLogging
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.get
import name.anton3.vkapi.methods.longpoll.objects.LongPollFailure
import java.io.IOException
import java.nio.charset.Charset
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.CoroutineContext

private val log = KotlinLogging.logger {}

abstract class AbstractLongPollEventSource<EventType, IteratorType>(
    private val longPollContext: CoroutineContext,
    protected val objectMapper: ObjectMapper,
    protected val transportClient: TransportClient,
    private val responseType: TypeReference<LongPollResponse<EventType>>
) {
    private val shutdown = AtomicBoolean(false)

    abstract suspend fun iteratorToUrl(iterator: IteratorType): String

    abstract suspend fun iteratorWithTs(iterator: IteratorType, ts: Int): IteratorType

    abstract suspend fun iterator(): IteratorType

    suspend fun getEvents(iterator: IteratorType): Pair<IteratorType, List<EventType>> {
        val vkResponse = withContext(longPollContext) {
            transportClient.get(iteratorToUrl(iterator))
        }

        val vkJson = vkResponse.data.toString(Charset.forName("UTF-8"))
        log.debug("VK long poll responds with $vkJson")

        @Suppress("BlockingMethodInNonBlockingContext")
        val lpResponse: LongPollResponse<EventType> = objectMapper.readValue(vkJson, responseType)

        return when (lpResponse.failed) {
            null -> {
                iteratorWithTs(iterator, lpResponse.ts!!) to lpResponse.updates
            }
            LongPollFailure.NEW_TS -> {
                log.debug("LongPoll failed with error 1")
                iteratorWithTs(iterator, lpResponse.ts!!) to emptyList()
            }
            LongPollFailure.REQUEST_NEW_KEY -> {
                val newServer = iterator()
                log.debug("LongPoll failed with error 2")
                newServer to emptyList()
            }
            LongPollFailure.REQUEST_NEW_KEY_TS -> {
                val newServer = iterator()
                log.debug("LongPoll failed with error 3")
                newServer to emptyList()
            }
            LongPollFailure.INVALID_VERSION -> {
                error("LongPoll failed with error 4: Invalid version")
            }
        }
    }

    @Suppress("EXPERIMENTAL_API_USAGE")
    fun produceEvents(scope: CoroutineScope): ReceiveChannel<EventType> = scope.produce {
        var iter = iteratorSwallowing()

        while (true) {
            val response = try {
                getEvents(iter)
            } catch (e: IOException) {
                log.warn("LongPoll error", e)
                iter = iteratorSwallowing()
                continue
            }

            iter = response.first
            val events = response.second

            if (channel.isClosedForSend) break
            try {
                events.forEach { send(it) }
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
                log.warn("LongPoll iterator error", e)
            }
        }
    }
}
