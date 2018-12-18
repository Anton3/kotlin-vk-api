package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.vktypes.VkResponse

fun ObjectMapper.serializeMethod(method: VkMethod<*>): Map<String, String> {
    return this.convertValue<Map<String, Any?>>(method, MAP_TYPE)
        .filterValues { it != null }
        .entries
        .map { restorePropNames(it.key) to requestValueToString(it.value!!, this) }
        .toMap() + method.unsafeParams
}

fun <T> ObjectMapper.deserializeResponse(method: VkMethod<T>, response: ByteArray): VkResponse<T> {
    val typeFactory = this.typeFactory
    val resultType = typeFactory.constructType(method.responseType)
    val responseType = typeFactory.constructCollectionLikeType(VkResponse::class.java, resultType)

    val reader = this.reader(method.parserAttributes)
    return reader.forType(responseType).readValue<VkResponse<T>>(response)
}

private val MAP_TYPE = strongType<Map<String, String>>()

private fun restorePropNames(name: String): String = when (name) {
    "cls" -> "class"
    "obj" -> "object"
    else -> name
}

private fun requestValueToString(value: Any, objectMapper: ObjectMapper): String {
    return when (value) {
        is List<*> -> value.joinToString(",")
        is Map<*, *> -> objectMapper.writeValueAsString(value)
        else -> value.toString()
    }
}
