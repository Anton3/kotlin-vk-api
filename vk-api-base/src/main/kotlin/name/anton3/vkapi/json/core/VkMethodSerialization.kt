package name.anton3.vkapi.json.core

import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.ValueNode
import name.anton3.vkapi.json.attributes.ForwardableAttributes
import name.anton3.vkapi.json.attributes.reader
import name.anton3.vkapi.json.attributes.writer
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkResponse

fun ObjectMapper.serializeMethod(method: VkMethod<*, *>): Map<String, String> {
    return valueToTree<ObjectNode>(method).fields().asSequence()
        .associate { it.key to propertyValueToParameter(it.value, this) }
}

fun <T> ObjectMapper.deserializeResponse(method: VkMethod<T, *>, response: String): VkResponse<T> {
    return reader(ForwardableAttributes(METHOD_ATTRIBUTE, method))
        .forType(responseType(method))
        .readValue(response)
}

fun ObjectMapper.serializeResponse(method: VkMethod<*, *>, response: VkResponse<*>): String {
    return writer(ForwardableAttributes(METHOD_ATTRIBUTE, method))
        .forType(responseType(method))
        .writeValueAsString(response)
}

private fun ObjectMapper.responseType(method: VkMethod<*, *>): JavaType {
    val typeFactory = this.typeFactory
    val resultType = typeFactory.constructType(method.responseType)
    return typeFactory.constructCollectionLikeType(VkResponse::class.java, resultType)
}

private fun propertyValueToParameter(value: JsonNode, objectMapper: ObjectMapper): String = when (value) {
    is ValueNode -> value.asText()
    is ArrayNode -> value.elements().asSequence().joinToString(",") { it.asText() }
    else -> objectMapper.writeValueAsString(value)
}

const val METHOD_ATTRIBUTE: String = "method"
