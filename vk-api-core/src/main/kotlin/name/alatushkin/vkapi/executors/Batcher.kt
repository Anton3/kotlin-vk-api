package name.alatushkin.vkapi.executors

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import java.time.Duration

class Batcher<Request, Response>(
    batchExecutorScope: CoroutineScope,
    flushDelay: Duration,
    batchSizeLimit: Int,
    batchExecutor: suspend (List<Request>) -> List<Response>
) {
    suspend operator fun invoke(request: Request): Response {
        val queuedRequest = QueuedRequest<Request, Response>(request, CompletableDeferred())
        actor.send(Message.NewRequest(queuedRequest))
        return queuedRequest.handler.await()
    }

    suspend fun flush() {
        actor.send(Message.Flush())
    }

    fun close() {
        actor.close()
    }

    private val actor = BatcherActor(batchExecutorScope, flushDelay, batchSizeLimit, batchExecutor).actor
}

private data class QueuedRequest<Request, Response>(
    val request: Request,
    val handler: CompletableDeferred<Response> = CompletableDeferred(),
    var causesFlush: Boolean = true
)

@Suppress("unused")
private sealed class Message<Request, Response> {
    data class NewRequest<Request, Response>(val queuedRequest: QueuedRequest<Request, Response>)
        : Message<Request, Response>()

    data class TimeElapsed<Request, Response>(val queuedRequest: QueuedRequest<Request, Response>)
        : Message<Request, Response>()

    class Flush<Request, Response>
        : Message<Request, Response>()
}

private class BatcherActor<Request, Response>(
    private val coroutineScope: CoroutineScope,
    private val flushDelay: Duration,
    private val batchSizeLimit: Int,
    private val batchExecutor: suspend (List<Request>) -> List<Response>
) {
    init {
        require(batchSizeLimit > 0)
        require(!flushDelay.isNegative)
    }

    private var requests: MutableList<QueuedRequest<Request, Response>> = mutableListOf()

    @Suppress("EXPERIMENTAL_API_USAGE")
    val actor = coroutineScope.actor<Message<Request, Response>> {
        channel.consumeEach { message ->
            when (message) {
                is Message.NewRequest -> onNewRequest(message)
                is Message.TimeElapsed -> onTimeElapsed(message)
                is Message.Flush -> onFlush(message)
            }
        }
        if (requests.isNotEmpty()) execute(requests)
    }

    private suspend fun onNewRequest(message: Message.NewRequest<Request, Response>) {
        val queuedRequest = message.queuedRequest
        requests.add(queuedRequest)

        if (requests.size == batchSizeLimit) {
            flush()
        } else {
            ensureTimeLimit(queuedRequest)
        }
    }

    private suspend fun onTimeElapsed(message: Message.TimeElapsed<Request, Response>) {
        val queuedRequest = message.queuedRequest
        if (queuedRequest.causesFlush) flush()
    }

    @Suppress("UNUSED_PARAMETER")
    private suspend fun onFlush(message: Message.Flush<Request, Response>) {
        if (requests.isNotEmpty()) flush()
    }

    private fun ensureTimeLimit(queuedRequest: QueuedRequest<Request, Response>) = coroutineScope.launch {
        delay(flushDelay)
        try {
            actor.send(Message.TimeElapsed(queuedRequest))
        } catch (e: ClosedSendChannelException) {
            // No worries, requests will be flushed anyway
        }
    }

    private suspend fun flush() {
        val pendingRequests = requests
        requests = mutableListOf()

        coroutineScope.launch {
            execute(pendingRequests)
        }
    }

    private suspend fun execute(pendingRequests: List<QueuedRequest<Request, Response>>) {
        val responses = try {
            batchExecutor(pendingRequests.map { it.request })
        } catch (e: Throwable) {
            pendingRequests.forEach { it.handler.completeExceptionally(e) }
            null
        }

        if (responses != null) {
            pendingRequests.zip(responses) { queuedRequest, response ->
                queuedRequest.handler.complete(response)
            }
        }

        pendingRequests.forEach { it.causesFlush = false }
    }
}
