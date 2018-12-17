package name.alatushkin.vkapi.methods.execute

import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.core.extractExecuteResult
import name.alatushkin.vkapi.executors.MethodExecutor
import name.alatushkin.vkapi.tokens.Token
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
