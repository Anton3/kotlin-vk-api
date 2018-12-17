package name.alatushkin.vkapi.executors

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.core.wrapInSimpleResponse
import name.alatushkin.vkapi.methods.execute.BATCH_EXECUTE_LIMIT
import name.alatushkin.vkapi.methods.execute.batchUnchecked
import name.alatushkin.vkapi.methods.execute.supportsBatch
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.tokens.UserGroupMethod
import name.alatushkin.vkapi.vktypes.VkResponse
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

    override suspend fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T> {
        return if (method.supportsBatch()) {
            @Suppress("UNCHECKED_CAST")
            batcher(method).wrapInSimpleResponse() as VkResponse<T>
        } else {
            base(method, token)
        }
    }
}
