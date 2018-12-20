package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.core.*
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.tokens.attach
import java.io.IOException

suspend fun MethodExecutor.batchUnchecked(methods: List<VkMethod<*>>, token: Token<*>): List<VkResult<*>> {
    val batchMethod = BatchExecuteMethod(methods, objectMapper).attach(token)
    return this(batchMethod).extractExecuteResult().unwrap().parseBatchResponse()
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
