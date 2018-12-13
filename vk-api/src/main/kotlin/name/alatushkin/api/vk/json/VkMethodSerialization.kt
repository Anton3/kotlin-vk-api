package name.alatushkin.api.vk.json

import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.Keyboard
import name.alatushkin.api.vk.json.desersupport.reader
import name.alatushkin.api.vk.json.desersupport.strongType
import name.alatushkin.api.vk.vktypes.VkResponse

fun VkMethod<*>.toUrlParams(): Map<String, String> {
    return VK_OBJECT_MAPPER.convertValue<Map<String, Any?>>(this, MAP_TYPE)
        .filterValues { it != null }
        .mapKeys { restorePropNames(it.key) }
        .entries
        .map { it.key to toStringRequestValue(it.value) }
        .toMap() + unsafeParams
}

fun <T> VkMethod<T>.deserializeResponse(response: ByteArray): VkResponse<T> {
    val typeFactory = VK_OBJECT_MAPPER.typeFactory
    val resultType = typeFactory.constructType(responseType)
    val responseType = typeFactory.constructCollectionLikeType(VkResponse::class.java, resultType)

    val reader = VK_OBJECT_MAPPER.reader(parserAttributes)
    return reader.forType(responseType).readValue<VkResponse<T>>(response)
}

private val MAP_TYPE = strongType<Map<String, String>>()

private fun restorePropNames(name: String): String = when (name) {
    "cls" -> "class"
    "obj" -> "object"
    else -> name
}

private fun toStringRequestValue(value: Any?): String = when (value) {
    is List<*> -> value.joinToString(",")
    is Keyboard -> VK_OBJECT_MAPPER.writeValueAsString(value)
    else -> value.toString()
}
