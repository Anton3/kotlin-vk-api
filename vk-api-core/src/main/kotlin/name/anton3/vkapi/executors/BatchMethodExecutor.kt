package name.anton3.vkapi.executors

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.VkResult
import name.anton3.vkapi.core.wrapInSimpleResponse
import name.anton3.vkapi.methods.execute.batchUnchecked
import name.anton3.vkapi.methods.execute.supportsBatch
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.CoroutineContext

class BatchMethodExecutor(
    private val base: MethodExecutor,
    private val token: Token<UserGroupMethod>,
    private val rateProvider: RateProvider,
    flushDelay: Duration,
    coroutineContext: CoroutineContext = Dispatchers.Default
) : MethodExecutor by base, AsyncCloseable {

    init {
        rateProvider.addFreeRateHandler(this::freeRateHandler)
    }

    private val coroutineScope: CoroutineScope = CoroutineScope(coroutineContext)

    private val batcher: Batcher<VkMethod<*>, VkResult<*>> = Batcher(
        scope = coroutineScope,
        batchLimit = BATCH_EXECUTE_LIMIT,
        flushDelay = flushDelay,
        timeoutHandler = this::timeoutHandler,
        preExecute = this::preExecute,
        executor = this::executeBatch
    )

    private suspend fun executeBatch(methods: List<VkMethod<*>>): List<VkResult<*>> {
        return base.batchUnchecked(methods, token)
    }

    private var throttledTimeoutReceived: AtomicBoolean = AtomicBoolean(false)

    private fun timeoutHandler(): Boolean {
        val throttling = rateProvider.isThrottling
        throttledTimeoutReceived.set(throttling)
        return !throttling
    }

    private fun preExecute() {
        throttledTimeoutReceived.set(false)
    }

    private fun freeRateHandler(): Boolean {
        val shouldFlush = throttledTimeoutReceived.getAndSet(false)
        if (shouldFlush) {
            coroutineScope.launch {
                batcher.flush()
            }
        }
        return shouldFlush
    }

    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        return if (method.supportsBatch()) {
            method.accessToken = null  // shorter requests
            @Suppress("UNCHECKED_CAST")
            batcher(method).wrapInSimpleResponse() as VkResponse<T>
        } else {
            base(method)
        }
    }

    override fun close() {
        batcher.close()
    }

    override suspend fun join() {
        batcher.join()
    }

    companion object {
        const val BATCH_EXECUTE_LIMIT = 25
    }
}
