package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.instances.BatchExecutor
import name.anton3.vkapi.core.*
import name.anton3.vkapi.methods.execute.batch
import name.anton3.vkapi.vktypes.VkApiException
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
        BatchExecutor(methodListExecutor, coroutineContext, BATCH_EXECUTE_LIMIT, flushDelay)

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return (if (dynamicRequest[SupportsVkScript] == true) batcher else base).execute(dynamicRequest)
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

private class MethodListExecutor(private val base: MethodExecutor)
    : DynamicExecutor<List<VkMethod<*>>, List<VkResponse<*>>> {

    override suspend fun execute(dynamicRequest: DynamicRequest<List<VkMethod<*>>>): List<VkResponse<*>> {
        return try {
            base.batch(dynamicRequest).map { it.wrapInSimpleResponse() }
        } catch (e: VkApiException) {
            if (shouldSplitBatch(e)) {
                // Handle Execute error 13 correctly: bisect the batch until mini-batches succeed
                //
                // This requires up to twice the amount of requests if they all fail,
                // but can save a lot of requests if some of them succeed early
                val methods = dynamicRequest.get()
                if (methods.size == 1) listOf(base.execute(methods.single())) else splitAndExecute(methods)
            } else {
                throw e
            }
        }
    }

    private suspend fun executeMethodSublist(methods: List<VkMethod<*>>): List<VkResponse<*>> {
        if (methods.size == 1) return listOf(base.execute(methods.single()))

        return try {
            base.batch(methods).map { it.wrapInSimpleResponse() }
        } catch (e: VkApiException) {
            if (shouldSplitBatch(e)) {
                splitAndExecute(methods)
            } else {
                throw e
            }
        }
    }

    private suspend fun splitAndExecute(methods: List<VkMethod<*>>): List<VkResponse<*>> {
        val halfSize = (methods.size + 1) / 2
        val requestSplit1 = methods.subList(0, halfSize)
        val requestSplit2 = methods.subList(halfSize, methods.size)

        return coroutineScope {
            val responseSplit1Async = async { executeMethodSublist(requestSplit1) }
            val responseSplit2 = executeMethodSublist(requestSplit2)

            responseSplit1Async.await() + responseSplit2
        }
    }

    private fun shouldSplitBatch(e: VkApiException): Boolean {
        return e.vkError.errorCode == 13 && e.vkError.errorMsg == "response size is too big"
    }
}
