package name.alatushkin.api.vk.execute

import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.core.VkResult
import name.alatushkin.api.vk.json.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.json.toUrlParams
import name.alatushkin.api.vk.tokens.UserOrGroupMethod
import name.alatushkin.api.vk.tokens.VkClient
import java.io.IOException

suspend fun VkClient<*>.batchUnchecked(methods: List<VkMethod<*>>): List<VkResult<*>> {
    return parseBatchVkScriptResponse(executor(makeBatchExecuteMethod(methods), token))
}

@Suppress("UNCHECKED_CAST")
suspend inline fun <T, M> VkClient<M>.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserOrGroupMethod =
    batchUnchecked(methods) as List<VkResult<T>>

internal fun makeBatchVkScript(methods: List<VkMethod<*>>): String {
    return methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = VK_OBJECT_MAPPER.writeValueAsString(method.toUrlParams())
        "API." + method.apiMethodName + "($argsJson)"
    }
}

internal fun makeBatchExecuteMethod(methods: List<VkMethod<*>>): BatchExecuteMethod {
    return BatchExecuteMethod(makeBatchVkScript(methods), methods.map { it.responseType })
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
