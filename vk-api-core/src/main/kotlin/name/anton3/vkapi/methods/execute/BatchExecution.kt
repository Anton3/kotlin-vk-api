package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.VkResult
import name.anton3.vkapi.core.extractExecuteResult
import name.anton3.vkapi.executors.MethodExecutor
import name.anton3.vkapi.tokens.Token
import java.io.IOException

suspend fun MethodExecutor.batchUnchecked(methods: List<VkMethod<*>>, token: Token<*>): List<VkResult<*>> {
    val batchMethod = BatchExecuteMethod(methods, objectMapper)
    return this(batchMethod, token).extractExecuteResult().unwrap().parseBatchResponse()
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
            VkResult.Failure<Any?>(errors[errorIndex]).also { ++errorIndex }
        }
    }
}
