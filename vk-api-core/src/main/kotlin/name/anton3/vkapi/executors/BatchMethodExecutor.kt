package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.wrapInSimpleResponse
import name.anton3.vkapi.methods.execute.batch
import name.anton3.vkapi.rate.BatchExecutor
import name.anton3.vkapi.rate.DynamicExecutor
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.vktypes.VkResponse
import java.io.Closeable
import java.time.Duration
import kotlin.coroutines.CoroutineContext

/**
 * Note: BatchMethodExecutor does not add token to Execute requests. Add a TokenMethodExecutor under it
 */
class BatchMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext,
    flushDelay: Duration
) : MethodExecutor, Closeable {

    private val methodListExecutor = MethodListExecutor(base)

    private val batcher: BatchExecutor<VkMethod<*>, VkResponse<*>> =
        BatchExecutor(methodListExecutor, coroutineContext, BATCH_EXECUTE_LIMIT, flushDelay, false)

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return (if (dynamicRequest.canBeBatched) batcher else base).execute(dynamicRequest)
    }

    override val transportClient: TransportClient get() = base.transportClient
    override val objectMapper: ObjectMapper get() = base.objectMapper

    override fun close() {
        batcher.close()
    }

    companion object {
        const val BATCH_EXECUTE_LIMIT = 25
    }
}

private class MethodListExecutor(
    private val base: MethodExecutor
) : DynamicExecutor<List<VkMethod<*>>, List<VkResponse<*>>> {

    override suspend fun execute(dynamicRequest: DynamicRequest<List<VkMethod<*>>>): List<VkResponse<*>> {
        return base.batch(dynamicRequest).map { it.wrapInSimpleResponse() }
    }
}
