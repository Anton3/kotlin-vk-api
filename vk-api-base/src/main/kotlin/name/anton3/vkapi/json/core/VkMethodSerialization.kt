package name.anton3.vkapi.json.core

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.ValueNode
import name.anton3.vkapi.json.attributes.ForwardableAttributes
import name.anton3.vkapi.json.attributes.reader
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkResponse

fun ObjectMapper.serializeMethod(method: VkMethod<*>): Map<String, String> {
    return valueToTree<ObjectNode>(method)
        .fields()
        .asSequence()
        .associate { it.key to propertyValueToParameter(it.value, this) } + method.unsafeParams
}

fun <T> ObjectMapper.deserializeResponse(method: VkMethod<T>, response: ByteArray): VkResponse<T> {
    val typeFactory = this.typeFactory
    val resultType = typeFactory.constructType(method.responseType)
    val responseType = typeFactory.constructCollectionLikeType(VkResponse::class.java, resultType)

    val reader = this.reader(ForwardableAttributes(METHOD_ATTRIBUTE, method))
    return reader.forType(responseType).readValue(response)
}

private fun propertyValueToParameter(value: JsonNode, objectMapper: ObjectMapper): String = when (value) {
    is ValueNode -> value.asText()
    is ArrayNode -> value.elements().asSequence().joinToString(",") { it.asText() }
    else -> objectMapper.writeValueAsString(value)
}

const val METHOD_ATTRIBUTE = "method"
