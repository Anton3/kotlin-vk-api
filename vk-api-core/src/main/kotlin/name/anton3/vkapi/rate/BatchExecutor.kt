package name.anton3.vkapi.rate

import java.time.Duration
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.coroutines.CoroutineContext

class RatedBatchStrategy<Request, Response>(
    private val base: RatedExecutor<List<Request>, List<Response>>,
    private val batchSizeLimit: Int
) : BatchStrategy<Request, Response> {

    private val throttledTimeoutReceived: AtomicBoolean = AtomicBoolean(false)
    private val batchCount: AtomicInteger = AtomicInteger(0)
    private val requestProducers: RequestProducers<Request, Response> =
        RequestProducers()

    override fun isFull(requests: List<Request>): Boolean {
        batchCount.set(requests.size)
        return requests.size >= batchSizeLimit
    }

    override fun shouldFlushOnTimeout(): Boolean {
        val throttling = base.isThrottling
        throttledTimeoutReceived.set(throttling)
        return !throttling
    }

    override suspend fun selectBatch(requests: List<Request>): SelectedBatch<Request, Response> {
        batchCount.set(0)
        throttledTimeoutReceived.set(false)
        val batch = requests.take(batchSizeLimit)
        val spaceLeft = batchSizeLimit - batch.size
        val additionalRequests = requestProducers.produceRequests(spaceLeft)
        return SelectedBatch(batch, additionalRequests)
    }

    override suspend fun execute(batch: List<Request>): List<Response> {
        return base.execute(batch)
    }

    fun getThrottledTimeoutReceived(): Boolean {
        return throttledTimeoutReceived.get()
    }

    fun getBatchCount(): Int {
        return batchCount.get()
    }

    fun addRequestProducer(producer: RequestProducer<Request, Response>) {
        requestProducers.add(producer)
    }
}

class BatchExecutor<Request, Response>(
    private val base: RatedExecutor<List<Request>, List<Response>>,
    flushDelay: Duration,
    private val batchSizeLimit: Int
) : RatedExecutor<Request, Response>,
    AsyncCloseable {

    private val strategy: RatedBatchStrategy<Request, Response> =
        RatedBatchStrategy(base, batchSizeLimit)

    private val batcher: Batcher<Request, Response> =
        Batcher(coroutineContext, strategy, flushDelay)

    init {
        base.addRequestProducer(object :
            RequestProducer<List<Request>, List<Response>> {
            override val isUrgent: Boolean
                get() = strategy.getThrottledTimeoutReceived()

            override suspend fun sendRequest(): SuspendedRequest<List<Request>, List<Response>>? {
                return batcher.extract().takeIf { it.request.isNotEmpty() }
            }
        })
    }

    override val coroutineContext: CoroutineContext
        get() = base.coroutineContext

    override suspend fun execute(request: Request): Response {
        return batcher(request)
    }

    override val rateLeft: Int
        get() = base.rateLeft * batchSizeLimit - strategy.getBatchCount()

    override fun addRequestProducer(producer: RequestProducer<Request, Response>) {
        strategy.addRequestProducer(producer)
    }

    override fun close() {
        batcher.close()
    }

    override suspend fun join() {
        batcher.join()
    }

    suspend fun flush() {
        batcher.flush()
    }
}
