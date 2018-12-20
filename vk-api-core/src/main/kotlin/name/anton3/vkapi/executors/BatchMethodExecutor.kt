package name.anton3.vkapi.executors

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
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
import kotlin.coroutines.CoroutineContext

class BatchMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext = Dispatchers.Default,
    flushDelay: Duration,
    private val token: Token<UserGroupMethod>
) : MethodExecutor by base {

    private val coroutineScope: CoroutineScope = CoroutineScope(coroutineContext)

    private val batcher: Batcher<VkMethod<*>, VkResult<*>> = Batcher(
        coroutineScope,
        flushDelay = flushDelay,
        batchSizeLimit = BATCH_EXECUTE_LIMIT,
        batchExecutor = this::executeBatch
    )

    private suspend fun executeBatch(methods: List<VkMethod<*>>): List<VkResult<*>> {
        return base.batchUnchecked(methods, token)
    }

    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        return if (method.supportsBatch()) {
            @Suppress("UNCHECKED_CAST")
            batcher(method).wrapInSimpleResponse() as VkResponse<T>
        } else {
            base(method)
        }
    }

    companion object {
        const val BATCH_EXECUTE_LIMIT = 25
    }
}
