package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.ValueNode
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.json.attributes.ForwardableAttributes
import name.anton3.vkapi.json.attributes.reader
import name.anton3.vkapi.vktypes.VkResponse

fun ObjectMapper.serializeMethod(method: VkMethod<*>): Map<String, String> {
    return this.valueToTree<ObjectNode>(method)
        .fields().asSequence()
        .map { restorePropertyName(it.key) to propertyValueToParameter(it.value, this) }
        .toMap() + method.unsafeParams
}

fun <T> ObjectMapper.deserializeResponse(method: VkMethod<T>, response: ByteArray): VkResponse<T> {
    val typeFactory = this.typeFactory
    val resultType = typeFactory.constructType(method.responseType)
    val responseType = typeFactory.constructCollectionLikeType(VkResponse::class.java, resultType)

    val reader = this.reader(ForwardableAttributes(METHOD_ATTRIBUTE, method))
    return reader.forType(responseType).readValue<VkResponse<T>>(response)
}

private fun restorePropertyName(name: String): String = when (name) {
    "cls" -> "class"
    "obj" -> "object"
    else -> name
}

private fun propertyValueToParameter(value: JsonNode, objectMapper: ObjectMapper): String = when (value) {
    is ValueNode -> value.asText()
    else -> objectMapper.writeValueAsString(value)
}

internal const val METHOD_ATTRIBUTE = "method"
