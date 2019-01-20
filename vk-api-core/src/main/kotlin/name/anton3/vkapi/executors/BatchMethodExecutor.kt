package name.anton3.vkapi.executors

import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.extractExecuteResult
import name.anton3.vkapi.core.wrapInSimpleResponse
import name.anton3.vkapi.methods.execute.BatchExecuteMethod
import name.anton3.vkapi.methods.execute.BatchExecuteResult
import name.anton3.vkapi.methods.execute.parseBatchResponse
import name.anton3.vkapi.rate.*
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.tokens.attach
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class BatchMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext,
    private val token: Token<UserGroupMethod>,
    flushDelay: Duration
) : MethodExecutor by base, AsyncCloseable {

    private val batchExecutor: DynamicExecutor<List<VkMethod<*>>, List<VkResponse<*>>> =
        MappedDynamicExecutor(
            base = base,
            preprocessor = { methods ->
                BatchExecuteMethod(methods, objectMapper).attach(token)
            },
            postprocessor = { response ->
                @Suppress("UNCHECKED_CAST")
                val executeResponse = (response as VkResponse<BatchExecuteResult>).extractExecuteResult().unwrap()
                executeResponse.parseBatchResponse().map { it.wrapInSimpleResponse() }
            }
        )

    private val batcher: BatchExecutor<VkMethod<*>, VkResponse<*>> =
        BatchExecutor(batchExecutor, coroutineContext, BATCH_EXECUTE_LIMIT, flushDelay)

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return batcher.execute(dynamicRequest)
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
