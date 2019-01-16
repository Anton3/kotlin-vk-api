package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import java.time.Duration
import kotlin.coroutines.CoroutineContext

data class SelectedBatch<Request, Response>(
    val selected: List<Request>,
    val additional: List<SuspendedRequest<Request, Response>>
)

interface BatchStrategy<Request, Response> {
    fun isFull(requests: List<Request>): Boolean

    fun shouldFlushOnTimeout(): Boolean

    suspend fun selectBatch(requests: List<Request>): SelectedBatch<Request, Response>

    suspend fun execute(batch: List<Request>): List<Response>
}

class Batcher<Request, Response>(
    context: CoroutineContext,
    strategy: BatchStrategy<Request, Response>,
    flushDelay: Duration
) : AsyncCloseable {

    suspend operator fun invoke(request: Request): Response {
        val queuedRequest = SuspendedRequest<Request, Response>(request)
        actor.send(Message.NewRequest(queuedRequest))
        return queuedRequest.response.await()
    }

    suspend fun flush() {
        actor.send(Message.Flush())
    }

    suspend fun extract(): SuspendedRequest<List<Request>, List<Response>> {
        val asyncResult = CompletableDeferred<SuspendedRequest<List<Request>, List<Response>>>()
        actor.send(Message.Extract(asyncResult))
        return asyncResult.await()
    }

    override fun close() {
        actor.close()
    }

    override suspend fun join() {
        completionHandle.await()
    }

    private val completionHandle: CompletableDeferred<Unit> = CompletableDeferred()

    private val actor = BatcherActor(
        context = context,
        flushDelay = flushDelay,
        strategy = strategy,
        completionHandle = completionHandle
    )
}

@Suppress("unused")
private sealed class Message<Request, Response> {
    data class NewRequest<Request, Response>(val queuedRequest: SuspendedRequest<Request, Response>)
        : Message<Request, Response>()

    data class TimeElapsed<Request, Response>(val queuedRequest: SuspendedRequest<Request, Response>)
        : Message<Request, Response>()

    class Flush<Request, Response>
        : Message<Request, Response>()

    class Extract<Request, Response>(val extractedHandler: CompletableDeferred<SuspendedRequest<List<Request>, List<Response>>>)
        : Message<Request, Response>()
}

private class BatcherActor<Request, Response>(
    context: CoroutineContext,
    private val flushDelay: Duration,
    private val strategy: BatchStrategy<Request, Response>,
    private val completionHandle: CompletableDeferred<Unit>,
    private val channel: Channel<Message<Request, Response>> = Channel()
) : SendChannel<Message<Request, Response>> by channel {

    private val requests: MutableMap<Request, MutableSet<SuspendedRequest<Request, Response>>> = mutableMapOf()

    init {
        require(!flushDelay.isNegative)

        CoroutineScope(context).launch {
            for (message in channel) {
                processMessage(message)
            }
            while (requests.isNotEmpty()) {
                flush()
            }
        }.invokeOnCompletion {
            completionHandle.complete(Unit)
        }
    }

    private suspend fun CoroutineScope.processMessage(message: Message<Request, Response>) {
        return when (message) {
            is Message.NewRequest -> onNewRequest(message)
            is Message.TimeElapsed -> onTimeElapsed(message)
            is Message.Flush -> onFlush()
            is Message.Extract -> onExtract(message)
        }
    }

    private suspend fun CoroutineScope.onNewRequest(message: Message.NewRequest<Request, Response>) {
        val queuedRequest = message.queuedRequest
        requests.getOrPut(queuedRequest.request) { mutableSetOf() }.add(queuedRequest)

        if (strategy.isFull(requests.map { it.key })) {
            flush()
        } else {
            ensureTimeLimit(queuedRequest)
        }
    }

    private suspend fun CoroutineScope.onTimeElapsed(message: Message.TimeElapsed<Request, Response>) {
        if (requests.containsKey(message.queuedRequest.request) && strategy.shouldFlushOnTimeout()) flush()
    }

    private suspend fun CoroutineScope.onFlush() {
        if (requests.isNotEmpty()) flush()
    }

    private suspend fun CoroutineScope.onExtract(message: Message.Extract<Request, Response>) {
        if (requests.isEmpty()) {
            message.extractedHandler.complete(
                SuspendedRequest(
                    listOf(),
                    CompletableDeferred(listOf())
                )
            )
        } else {
            message.extractedHandler.complete(extract())
        }
    }

    private fun CoroutineScope.ensureTimeLimit(queuedRequest: SuspendedRequest<Request, Response>): Job = launch {
        delay(flushDelay)
        try {
            channel.send(Message.TimeElapsed(queuedRequest))
        } catch (e: ClosedSendChannelException) {
            // No worries, requests will be flushed anyway
        }
    }

    private suspend fun CoroutineScope.flush() {
        val batchSuspendedResponse = extract()
        launch {
            batchSuspendedResponse.complete { strategy.execute(it) }
        }
    }

    private suspend fun CoroutineScope.extract(): SuspendedRequest<List<Request>, List<Response>> {

        val (selected, additional) = strategy.selectBatch(requests.keys.toList())
        for (suspendedRequest in additional) {
            requests.getOrPut(suspendedRequest.request) { mutableSetOf() }.add(suspendedRequest)
        }

        val pendingRequests = (selected + additional.map { it.request }).distinct()
        val fullPendingRequests = pendingRequests.mapNotNull { key -> requests[key] }
        pendingRequests.forEach { requests.remove(it) }

        val asyncBatchResponse = CompletableDeferred<List<Response>>()

        launch {
            val batchResult = runCatching {
                asyncBatchResponse.await()
            }

            batchResult.fold(
                onSuccess = { batchResponse ->
                    fullPendingRequests.zip(batchResponse) { fullPendingRequest, response ->
                        fullPendingRequest.asSequence().forEach { it.response.complete(response) }
                    }
                },
                onFailure = { exception ->
                    fullPendingRequests.asSequence().flatten().forEach { it.response.completeExceptionally(exception) }
                }
            )
        }

        return SuspendedRequest(pendingRequests, asyncBatchResponse)
    }
}
