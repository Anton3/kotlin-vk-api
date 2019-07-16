package name.anton3.vkapi.rate

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.time.delay
import java.io.Closeable
import java.time.Duration
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.CoroutineContext

class BatchExecutor<Request, Response>(
    private val base: DynamicExecutor<List<Request>, List<Response>>,
    coroutineContext: CoroutineContext,
    private val batchSize: Int,
    private val flushDelay: Duration,
    private val canBeBatched: Boolean
) : DynamicExecutor<Request, Response>, Closeable {

    private class RequestData<Request, Response>(
        val completableRequest: CompletableRequest<Request, Response>,
        var isTimedOut: Boolean = false
    )

    private val job: Job = SupervisorJob(parent = coroutineContext[Job])
    private val coroutineContext: CoroutineContext = coroutineContext + job
    private val coroutineScope: CoroutineScope = CoroutineScope(this.coroutineContext)

    private val pendingRequests: MutableSet<RequestData<Request, Response>> = LinkedHashSet()
    private var pendingBatchRequests: Int = 0
    private val incompleteBatchRequest: AtomicReference<BatchDynamicRequest?> = AtomicReference(null)
    private var requestsTimedOut: Int = 0
    private val mutex: Mutex = Mutex()

    init {
        require(!flushDelay.isNegative)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = dynamicRequest.submit(coroutineContext) {
        mutex.withLock<Unit> {
            val requestData = RequestData(it)
            pendingRequests.add(requestData)

            if (pendingRequests.size == pendingBatchRequests * batchSize + batchSize) {
                // There are enough requests for a new complete batch.
                sendDynamicBatchRequest()
            } else {
                if (pendingRequests.size == pendingBatchRequests * batchSize) {
                    // Last batch was created because of timed out requests. Now it becomes complete.
                    incompleteBatchRequest.set(null)
                }

                coroutineScope.launch {
                    delay(flushDelay)
                    timeElapsed(requestData)
                }
            }
        }
    }

    suspend fun flush() {
        mutex.withLock {
            if (pendingRequests.size > pendingBatchRequests * batchSize) {
                sendDynamicBatchRequest()
            }
        }
    }

    private suspend fun timeElapsed(requestData: RequestData<Request, Response>) {
        mutex.withLock {
            if (requestData in pendingRequests && !requestData.isTimedOut) {
                requestData.isTimedOut = true
                ++requestsTimedOut

                if (requestsTimedOut > pendingBatchRequests * batchSize) {
                    sendDynamicBatchRequest()
                }
            }
        }
    }

    private fun sendDynamicBatchRequest() {
        val dynamicBatchRequest = BatchDynamicRequest()

        if (pendingRequests.size < pendingBatchRequests * batchSize + batchSize) {
            // This batch is being created by timeElapsed() or flush(). It's incomplete.
            incompleteBatchRequest.set(dynamicBatchRequest)
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

    private inner class BatchDynamicRequest : SynchronizedDynamicRequest<List<Request>>() {
        var batch: List<CompletableRequest<Request, Response>> = emptyList()

        override val canBeBatched: Boolean
            get() = this@BatchExecutor.canBeBatched

        override val isIncompleteBatch: Boolean
            get() = incompleteBatchRequest.get() == this

        override suspend fun finalize(): List<Request> {
            mutex.withLock {
                --pendingBatchRequests
                batch = extractBatch()
            }

            return batch.map { it.request.get() }
        }
    }

    private fun extractBatch(): List<CompletableRequest<Request, Response>> {
        val selectedRequestsWithData = pendingRequests.sortedByDescending { data ->
            (if (!data.completableRequest.request.isIncompleteBatch) 2 else 0) + (if (data.isTimedOut) 1 else 0)
        }.take(batchSize)

        requestsTimedOut -= selectedRequestsWithData.count { it.isTimedOut }

        selectedRequestsWithData.forEach {
            pendingRequests.remove(it)
        }

        return selectedRequestsWithData.map { it.completableRequest }
    }

    override fun close() {
        job.cancel()
    }
}
