package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.core.*
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.rate.map
import java.io.IOException

suspend fun MethodExecutor.batch(methods: List<VkMethod<*>>): List<VkResult<*>> {
    val batchMethod = BatchExecuteMethod(methods, objectMapper)
    return executeTyped(batchMethod).extractExecuteResult().unwrap().parseBatchResponse()
}

suspend fun MethodExecutor.batch(dynamicMethods: DynamicRequest<List<VkMethod<*>>>): List<VkResult<*>> {
    val batchMethod = dynamicMethods.map { BatchExecuteMethod(it, objectMapper) }
    return executeTyped(batchMethod).extractExecuteResult().unwrap().parseBatchResponse()
}

internal fun ExecuteResponse<BatchExecuteResult>.parseBatchResponse(): List<VkResult<*>> {
    val results = response.childResults
    val errors = executeErrors

    var errorIndex = 0

    return results.map { result ->
        if (result != null) {
            VkResult.Success(result)
        } else {
            if (errorIndex >= errors.size) throw IOException("Some error descriptions are missing")
            VkResult.Failure<Any?>(errors[errorIndex++])
        }
    }
}
