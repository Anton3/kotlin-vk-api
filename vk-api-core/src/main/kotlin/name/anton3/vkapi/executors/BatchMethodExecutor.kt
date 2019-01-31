package name.anton3.vkapi.executors

import name.anton3.vkapi.core.*
import name.anton3.vkapi.methods.execute.BatchExecuteMethod
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
    token: Token<UserGroupMethod>,
    flushDelay: Duration
) : MethodExecutor by base, AsyncCloseable {

    private val methodListExecutor = MethodListExecutor(base, token)

    private val batcher: BatchExecutor<VkMethod<*>, VkResponse<*>> =
        BatchExecutor(methodListExecutor, coroutineContext, BATCH_EXECUTE_LIMIT, flushDelay, false)

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return (if (dynamicRequest.canBeBatched) batcher else base).execute(dynamicRequest)
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

private class MethodListExecutor(
    private val base: MethodExecutor,
    private val token: Token<UserGroupMethod>
) : DynamicExecutor<List<VkMethod<*>>, List<VkResponse<*>>> {

    override suspend fun execute(dynamicRequest: DynamicRequest<List<VkMethod<*>>>): List<VkResponse<*>> {
        val response = base.executeTyped(MappedDynamicRequest(dynamicRequest) { methods ->
            methods.forEach { it.accessToken = null }  // shorter requests
            BatchExecuteMethod(methods, base.objectMapper).attach(token)
        })
        return response.extractExecuteResult().unwrap().parseBatchResponse().map { it.wrapInSimpleResponse() }
    }
}
