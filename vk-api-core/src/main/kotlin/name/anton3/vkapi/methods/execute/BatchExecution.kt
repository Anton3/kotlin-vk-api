package name.anton3.vkapi.methods.execute

import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.map
import name.anton3.vkapi.core.*
import name.anton3.vkapi.method.VkMethod
import java.io.IOException

suspend fun MethodExecutor.batch(methods: List<VkMethod<*, *>>): List<VkResult<*>> {
    val batchMethod = BatchExecuteMethod(methods, objectMapper)

    // executeTyped will lead to creation of SimpleMethodRequest, where supportsBatch = false (which is needed)
    return executeTyped(batchMethod).extractExecuteResult().unwrap().parseBatchResponse()
}

suspend fun MethodExecutor.batch(dynamicMethods: DynamicRequest<List<VkMethod<*, *>>>): List<VkResult<*>> {
    // If dynamicMethods[SupportsVkScript] == true, then batchMethod[SupportsVkBatch] == true, which is incorrect
    require(dynamicMethods[SupportsVkScript] != true)

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
