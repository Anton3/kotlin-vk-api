package name.anton3.vkapi.executors

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.sendBlocking
import kotlinx.coroutines.time.delay
import java.time.Duration

class Batcher<Request, Response>(
    scope: CoroutineScope,
    flushDelay: Duration,
    batchSizeLimit: Int,
    batchExecutor: suspend (List<Request>) -> List<Response>
) : AsyncCloseable {
    suspend operator fun invoke(request: Request): Response {
        val queuedRequest = QueuedRequest<Request, Response>(request, CompletableDeferred())
        actor.send(Message.NewRequest(queuedRequest))
        return queuedRequest.handler.await()
    }

    suspend fun flush() {
        actor.send(Message.Flush())
    }

    override fun close() {
        actor.close()
    }

    override suspend fun join() {
        completionHandle.await()
    }

    private val actor = BatcherActor(scope, flushDelay, batchSizeLimit, batchExecutor).actor
    private val completionHandle: CompletableDeferred<Unit> = CompletableDeferred()

    init {
        actor.sendBlocking(Message.SetCompletionHandle(completionHandle))
    }
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

    data class SetCompletionHandle<Request, Response>(val handle: CompletableDeferred<Unit>)
        : Message<Request, Response>()
}

private class BatcherActor<Request, Response>(
    scope: CoroutineScope,
    private val flushDelay: Duration,
    private val batchSizeLimit: Int,
    private val batchExecutor: suspend (List<Request>) -> List<Response>
) {
    init {
        require(batchSizeLimit > 0)
        require(!flushDelay.isNegative)
    }

    private var requests: MutableList<QueuedRequest<Request, Response>> = mutableListOf()

    private var completionHandle: CompletableDeferred<Unit>? = null

    @Suppress("EXPERIMENTAL_API_USAGE")
    val actor = scope.actor<Message<Request, Response>> {
        coroutineScope {
            channel.consumeEach { processMessage(it) }
            if (requests.isNotEmpty()) execute(requests)
        }
        completionHandle?.complete(Unit)
    }

    private suspend fun CoroutineScope.processMessage(message: Message<Request, Response>) {
        return when (message) {
            is Message.NewRequest -> onNewRequest(message)
            is Message.TimeElapsed -> onTimeElapsed(message)
            is Message.Flush -> onFlush()
            is Message.SetCompletionHandle -> onSetCompletionHandle(message)
        }
    }

    private suspend fun CoroutineScope.onNewRequest(message: Message.NewRequest<Request, Response>) {
        val queuedRequest = message.queuedRequest
        requests.add(queuedRequest)

        if (requests.size == batchSizeLimit) {
            flush()
        } else {
            ensureTimeLimit(queuedRequest)
        }
    }

    private suspend fun CoroutineScope.onTimeElapsed(message: Message.TimeElapsed<Request, Response>) {
        val queuedRequest = message.queuedRequest
        if (queuedRequest.causesFlush) flush()
    }

    private suspend fun CoroutineScope.onFlush() {
        if (requests.isNotEmpty()) flush()
    }

    private fun onSetCompletionHandle(message: Message.SetCompletionHandle<Request, Response>) {
        completionHandle = message.handle
    }

    private fun CoroutineScope.ensureTimeLimit(queuedRequest: QueuedRequest<Request, Response>): Job = launch {
        this.coroutineContext
        delay(flushDelay)
        try {
            actor.send(Message.TimeElapsed(queuedRequest))
        } catch (e: ClosedSendChannelException) {
            // No worries, requests will be flushed anyway
        }
    }

    private suspend fun CoroutineScope.flush() {
        val pendingRequests = requests
        requests = mutableListOf()

        launch {
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
