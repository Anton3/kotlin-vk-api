package name.anton3.vkapi.executors

import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.wrapInSimpleResponse
import name.anton3.vkapi.methods.execute.batch
import name.anton3.vkapi.rate.AsyncCloseable
import name.anton3.vkapi.rate.BatchExecutor
import name.anton3.vkapi.rate.DynamicExecutor
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration
import kotlin.coroutines.CoroutineContext

/**
 * Note: BatchMethodExecutor does not add token to Execute requests. Add a TokenMethodExecutor under it
 */
class BatchMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext,
    flushDelay: Duration
) : MethodExecutor by base, AsyncCloseable {

    private val methodListExecutor = MethodListExecutor(base)

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
    private val base: MethodExecutor
) : DynamicExecutor<List<VkMethod<*>>, List<VkResponse<*>>> {

    override suspend fun execute(dynamicRequest: DynamicRequest<List<VkMethod<*>>>): List<VkResponse<*>> {
        return base.batch(dynamicRequest).map { it.wrapInSimpleResponse() }
    }
}
