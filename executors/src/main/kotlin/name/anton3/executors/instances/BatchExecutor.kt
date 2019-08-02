package name.anton3.executors.instances

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.*
import name.anton3.executors.util.CompletableRequest
import name.anton3.executors.util.FifoRequestStorage
import java.io.Closeable
import java.time.Duration
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.CoroutineContext

class BatchExecutor<Request, Response>(
    private val base: DynamicExecutor<List<Request>, List<Response>>,
    coroutineContext: CoroutineContext,
    private val batchSize: Int,
    private val flushDelay: Duration,
    override val requestStorage: RequestStorage<Request> = FifoRequestStorage()
) : StoringDynamicExecutor<Request, Response>(), Closeable {

    override val job: Job = SupervisorJob(parent = coroutineContext[Job])
    private val coroutineContext: CoroutineContext = coroutineContext + job
    private val coroutineScope: CoroutineScope = CoroutineScope(this.coroutineContext)

    private val timedOutRequests: MutableSet<DynamicRequest<Request>> = HashSet()
    private var pendingRequestCount: Int = 0
    private var pendingBatchRequests: Int = 0
    private val incompleteBatchRequest: AtomicReference<BatchRequest?> = AtomicReference(null)
    private val mutex: Mutex = Mutex()

    init {
        require(!flushDelay.isNegative)
        require(batchSize > 0)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = mutex.withLock {
        val handle = add(dynamicRequest)
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
                timeElapsed(dynamicRequest)
            }
        }

        handle
    }.await()

    suspend fun flush() {
        mutex.withLock {
            if (pendingRequestCount > pendingBatchRequests * batchSize) {
                sendBatchRequest()
            }
        }
    }

    private suspend fun timeElapsed(request: DynamicRequest<Request>) {
        mutex.withLock {
            if (requestStorage.contains(request)) {
                timedOutRequests.add(request)

                if (timedOutRequests.size > pendingBatchRequests * batchSize) {
                    sendBatchRequest()
                }
            }
        }
    }

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
                    dynamicBatchRequest.batch.zip(batchResponse) { request, response ->
                        request.complete(response)
                    }
                },
                onFailure = { exception ->
                    dynamicBatchRequest.batch.forEach { request ->
                        request.completeExceptionally(exception)
                    }
                }
            )
        }
    }

    private inner class BatchRequest : SynchronizedDynamicRequest<List<Request>>() {

        var batch: List<CompletableRequest<Request, Response>> = emptyList()

        override suspend fun finalize(): List<Request> {
            mutex.withLock {
                --pendingBatchRequests
                batch = pollMany(minOf(batchSize, pendingRequestCount))
                pendingRequestCount -= batch.size
                batch.forEach { timedOutRequests.remove(it.request) }
            }

            return batch.map { it.request.get() }
        }

        @Suppress("UNCHECKED_CAST")
        override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = when(key) {
            is IsIncompleteBatch -> (incompleteBatchRequest.get() == this) as T
            else -> null
        }
    }

    // Should be called while `mutex` is locked.
    private suspend fun setIncompleteBatchRequest(batchRequest: BatchRequest?) {
        val oldIncompleteBatchRequest = incompleteBatchRequest.get()
        val affectedRequest = oldIncompleteBatchRequest ?: batchRequest ?: return

        affectedRequest.modify {
            incompleteBatchRequest.set(batchRequest)
        }
    }

    override fun close() {
        job.cancel()
    }
}
