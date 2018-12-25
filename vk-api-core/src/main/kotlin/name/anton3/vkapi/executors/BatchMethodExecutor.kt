package name.anton3.vkapi.executors

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.VkResult
import name.anton3.vkapi.core.wrapInSimpleResponse
import name.anton3.vkapi.methods.execute.BatchExecuteMethod
import name.anton3.vkapi.methods.execute.batchUnchecked
import name.anton3.vkapi.methods.execute.supportsBatch
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class BatchMethodExecutor(
    private val base: MethodExecutor,
    private val token: Token<UserGroupMethod>,
    private val rateProvider: RateProvider,
    flushDelay: Duration,
    coroutineContext: CoroutineContext = Dispatchers.Default
) : MethodExecutor by base, AsyncCloseable {

    init {
        rateProvider.setFreeRateHandler(this::onFreeRate)
    }

    private val coroutineScope: CoroutineScope = CoroutineScope(coroutineContext)

    private val batcher: Batcher<VkMethod<*>, VkResult<*>> = Batcher(
        coroutineScope,
        flushDelay = flushDelay,
        executor = this::executeBatch,
        limiter = this::batchLimit,
        timeoutHandler = this::handleTimeout
    )

    private suspend fun executeBatch(methods: List<VkMethod<*>>): List<VkResult<*>> {
        return base.batchUnchecked(methods, token)
    }

    private fun batchLimitInternal(methods: List<VkMethod<*>>): BatchLimit {
        if (methods.size > BATCH_EXECUTE_LIMIT) return BatchLimit.OVERFLOW
        if (methods.size == BATCH_EXECUTE_LIMIT) return BatchLimit.FULL

        val batchMethod = BatchExecuteMethod(methods, objectMapper)
        val batchCodeSize = batchMethod.code.length

        return when {
            batchCodeSize < BATCH_CODE_LIMIT -> BatchLimit.INCOMPLETE
            methods.size == 1 -> BatchLimit.FULL
            else -> BatchLimit.OVERFLOW
        }
    }

    // No synchronization, everything happens inside actor
    private var timeoutReceived: Boolean = false

    private fun batchLimit(methods: List<VkMethod<*>>): BatchLimit {
        val result = batchLimitInternal(methods)
        if (result != BatchLimit.INCOMPLETE) {
            timeoutReceived = false
        }
        return result
    }

    private fun handleTimeout(): Boolean {
        val throttling = rateProvider.isThrottling
        timeoutReceived = throttling
        return !throttling
    }

    private fun onFreeRate() {
        if (timeoutReceived) {
            timeoutReceived = false

            coroutineScope.launch {
                batcher.flush()
            }
        }
    }

    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        return if (method.supportsBatch()) {
            method.accessToken = null  // shorter URIs
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
        const val BATCH_CODE_LIMIT = 3900
    }
}
