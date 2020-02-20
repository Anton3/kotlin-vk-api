package name.anton3.executors.instances

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.*
import name.anton3.executors.util.FifoRequestStorage
import name.anton3.executors.util.complete
import name.anton3.executors.util.submit
import java.io.Closeable
import java.time.Duration
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.CoroutineContext

class BatchExecutor<Request, Response>(
    private val base: DynamicExecutor<List<Request>, List<Response>>,
    coroutineContext: CoroutineContext,
    private val batchSize: Int,
    private val flushDelay: Duration,
    requestStorage: RequestStorage<Request> = FifoRequestStorage()
) : DynamicExecutor<Request, Response>, Closeable {

    private val requestStorage = TypedRequestStorage<Request, InternalRequest<Request, Response>>(requestStorage)
    private val context = coroutineContext + SupervisorJob(parent = coroutineContext[Job])
    private val coroutineScope: CoroutineScope = CoroutineScope(context)

    private var pendingRequestCount: Int = 0
    private var pendingBatchRequests: Int = 0
    private val incompleteBatchRequest: AtomicReference<BatchRequest?> = AtomicReference(null)
    private val mutex: Mutex = Mutex()

    init {
        require(!flushDelay.isNegative)
        require(batchSize > 0)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = submit(context) { handle ->
        val internalRequest = InternalRequest(dynamicRequest, handle)

        mutex.withLock {
            requestStorage.add(internalRequest)
            ++pendingRequestCount

            if (pendingRequestCount >= pendingBatchRequests * batchSize + batchSize) {
                // There are enough requests for a new complete batch.
                sendBatchRequest()
            } else {
                if (pendingRequestCount == pendingBatchRequests * batchSize) {
                    // Last batch was created because of timed out requests. Now it becomes complete.
                    setIncompleteBatchRequest(null)
                }

                coroutineScope.launch {
                    delay(flushDelay)
                    timeElapsed(internalRequest)
                }
            }
        }
    }

    suspend fun flush() {
        mutex.withLock {
            if (pendingRequestCount > pendingBatchRequests * batchSize) {
                sendBatchRequest()
            }
        }
    }

    private suspend fun timeElapsed(request: InternalRequest<Request, Response>) {
        mutex.withLock {
            if (request.pending && pendingRequestCount > pendingBatchRequests * batchSize) {
                sendBatchRequest()
            }
        }
    }

    // Must only be called while `mutex` is locked.
    private suspend fun sendBatchRequest() {
        val dynamicBatchRequest = BatchRequest()

        if (pendingRequestCount < pendingBatchRequests * batchSize + batchSize) {
            // This batch is being created by timeElapsed() or flush(). It's incomplete.
            setIncompleteBatchRequest(dynamicBatchRequest)
        }

        ++pendingBatchRequests

        coroutineScope.launch {
            val batchResult = runCatching {
                base.execute(dynamicBatchRequest)
            }

            batchResult.fold(
                onSuccess = { batchResponse ->
                    dynamicBatchRequest.batchHandles.zip(batchResponse) { handle, response ->
                        handle.complete(Result.success(response))
                    }
                },
                onFailure = { exception ->
                    dynamicBatchRequest.batchHandles.forEach { handle ->
                        handle.complete(Result.failure(exception))
                    }
                }
            )
        }
    }

    private class InternalRequest<Request, Response>(
        val base: DynamicRequest<Request>,
        val handle: CompletableDeferred<Response>,
        var pending: Boolean = true
    ) : DynamicRequest<Request> by base

    private inner class BatchRequest : SynchronizedDynamicRequest<List<Request>>() {

        var batchHandles: List<CompletableDeferred<Response>> = emptyList()

        override suspend fun finalize(): List<Request> {
            val requests = mutex.withLock { extractBatch() }
            batchHandles = requests.map { it.handle }
            return requests.map { it.base.get() }
        }

        @Suppress("UNCHECKED_CAST")
        override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = when (key) {
            is IsIncompleteBatch -> (incompleteBatchRequest.get() == this) as T
            else -> null
        }
    }

    // Must only be called while `mutex` is locked.
    private suspend fun extractBatch(): List<InternalRequest<Request, Response>> {
        val requests = requestStorage.pollMany(minOf(batchSize, pendingRequestCount))
        requests.forEach { it.pending = false }
        pendingRequestCount -= requests.size
        --pendingBatchRequests
        return requests
    }

    // Must only be called while `mutex` is locked.
    private suspend fun setIncompleteBatchRequest(batchRequest: BatchRequest?) {
        val oldIncompleteBatchRequest = incompleteBatchRequest.get()
        val affectedRequest = oldIncompleteBatchRequest ?: batchRequest ?: return

        affectedRequest.modify {
            incompleteBatchRequest.set(batchRequest)
        }
    }

    override fun close() {
        context.cancel()
    }
}
