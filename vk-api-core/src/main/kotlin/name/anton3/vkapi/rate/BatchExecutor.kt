package name.anton3.vkapi.rate

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.time.delay
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class BatchExecutor<Request, Response>(
    private val base: DynamicExecutor<List<Request>, List<Response>>,
    override val coroutineContext: CoroutineContext,
    private val batchSize: Int,
    private val flushDelay: Duration
) : DynamicExecutor<Request, Response>, AsyncCloseable, CoroutineScope {

    private data class RequestData<Request, Response>(
        val request: SuspendedRequest<Request, Response>,
        var isTimedOut: Boolean = false
    )

    private val pendingRequests: MutableMap<DynamicRequest<Request>, RequestData<Request, Response>> = LinkedHashMap()
    private val pendingBatchRequests: MutableList<DynamicRequest<List<Request>>> = mutableListOf()
    private var requestsTimedOut: Int = 0
    private val mutex: Mutex = Mutex()

    init {
        require(!flushDelay.isNegative)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = dynamicRequest.submit {
        mutex.withLock {
            pendingRequests[dynamicRequest] = RequestData(it)

            if (pendingRequests.size >= pendingBatchRequests.size * batchSize + batchSize) {
                sendDynamicBatchRequest()
            } else {
                ensureTimeLimit(dynamicRequest)
            }
        }
    }

    suspend fun flush() = mutex.withLock {
        if (pendingRequests.size >= pendingBatchRequests.size * batchSize + 1) {
            sendDynamicBatchRequest()
        }
    }

    private suspend fun timeElapsed(dynamicRequest: DynamicRequest<Request>) = mutex.withLock {
        val requestData = pendingRequests[dynamicRequest]
        if (requestData?.isTimedOut == false) {
            requestData.isTimedOut = true
            ++requestsTimedOut
        }
        if (requestsTimedOut >= pendingBatchRequests.size * batchSize + 1) sendDynamicBatchRequest()
    }

    private fun CoroutineScope.ensureTimeLimit(queuedRequest: DynamicRequest<Request>): Job = launch {
        delay(flushDelay)
        try {
            timeElapsed(queuedRequest)
        } catch (e: ClosedSendChannelException) {
            // No worries, requests will be flushed anyway
        }
    }

    private fun CoroutineScope.sendDynamicBatchRequest() {
        lateinit var selectedChildRequests: List<SuspendedRequest<Request, Response>>

        val dynamicBatchRequest = object : DynamicRequest<List<Request>>() {
            override val isIncompleteBatch: Boolean
                get() = pendingRequests.size < batchSize * pendingBatchRequests.indexOf(this)

            override suspend fun finalize(): List<Request> = mutex.withLock {
                pendingBatchRequests.remove(this)

                val allRequestsWithData = zip(
                    pendingRequests.keys,
                    pendingRequests.keys.map { it.isIncompleteBatch },
                    pendingRequests.values.map { it.isTimedOut }
                )

                val selectedRequestsWithData = concatenate(
                    allRequestsWithData.asSequence().filter { !it.second && it.third },
                    allRequestsWithData.asSequence().filter { !it.second && !it.third },
                    allRequestsWithData.asSequence().filter { it.second }
                ).take(batchSize).toList()

                requestsTimedOut -= selectedRequestsWithData.count { it.third }
                selectedChildRequests = selectedRequestsWithData.map { pendingRequests[it.first]!!.request }
                selectedRequestsWithData.map { it.first.get() }
            }
        }

        pendingBatchRequests.add(dynamicBatchRequest)

        launch {
            val batchResult = runCatching {
                base.execute(dynamicBatchRequest)
            }

            batchResult.fold(
                onSuccess = { batchResponse ->
                    selectedChildRequests.zip(batchResponse) { request, response ->
                        request.complete(response)
                    }
                },
                onFailure = { exception ->
                    selectedChildRequests.forEach { request ->
                        request.completeExceptionally(exception)
                    }
                }
            )
        }
    }

    override fun close() {
        while (pendingBatchRequests.size * batchSize < pendingRequests.size) {
            sendDynamicBatchRequest()
        }
    }

    override suspend fun join() {
        coroutineContext[Job]!!.join()
    }
}

private fun <E> concatenate(vararg sequences: Sequence<E>): Sequence<E> {
    return if (sequences.isEmpty()) {
        emptySequence()
    } else {
        concatenate(*sequences.dropLast(1).toTypedArray()) + sequences.last()
    }
}

private fun <E1, S1: Iterable<E1>, E2, S2: Iterable<E2>, E3, S3: Iterable<E3>, R> zip(
    s1: S1,
    s2: S2,
    s3: S3,
    transform: (E1, E2, E3) -> R
): List<R> {
    return s1.zip(s2).zip(s3) { (e1, e2), e3 -> transform(e1, e2, e3) }
}

private fun <E1, S1: Iterable<E1>, E2, S2: Iterable<E2>, E3, S3: Iterable<E3>> zip(
    s1: S1,
    s2: S2,
    s3: S3
): List<Triple<E1, E2, E3>> = zip(s1, s2, s3) { e1, e2, e3 -> Triple(e1, e2, e3) }
