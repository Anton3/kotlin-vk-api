package name.alatushkin.vkapi.methods.execute

import com.fasterxml.jackson.databind.ObjectMapper
import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.json.serializeMethod
import name.alatushkin.vkapi.tokens.UserOrGroupMethod
import java.io.IOException

suspend fun VkClient<*>.batchUnchecked(methods: List<VkMethod<*>>): List<VkResult<*>> {
    val batchMethod = makeBatchExecuteMethod(methods, objectMapper)
    val response = executor(batchMethod, token).extractExecuteResult().unwrap()
    return parseBatchVkScriptResponse(response)
}

@Suppress("UNCHECKED_CAST")
suspend inline fun <T, M> VkClient<M>.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserOrGroupMethod =
    batchUnchecked(methods) as List<VkResult<T>>

internal fun makeBatchVkScript(methods: List<VkMethod<*>>, objectMapper: ObjectMapper): String {
    return methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = objectMapper.writeValueAsString(objectMapper.serializeMethod(method))
        "API." + method.apiMethodName + "($argsJson)"
    }
}

internal fun makeBatchExecuteMethod(methods: List<VkMethod<*>>, objectMapper: ObjectMapper): BatchExecuteMethod {
    return BatchExecuteMethod(makeBatchVkScript(methods, objectMapper), methods.map { it.responseType })
}

internal fun parseBatchVkScriptResponse(response: ExecuteResponse<BatchExecuteResult>): List<VkResult<*>> {
    val results = response.response.childResults
    val errors = response.executeErrors

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
