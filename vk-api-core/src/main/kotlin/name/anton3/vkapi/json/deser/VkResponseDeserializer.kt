package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ObjectNode
import name.anton3.vkapi.json.attributes.forwardableAttributes
import name.anton3.vkapi.json.attributes.reader
import name.anton3.vkapi.json.readNode
import name.anton3.vkapi.json.strongType
import name.anton3.vkapi.json.weakType
import name.anton3.vkapi.vktypes.VkError
import name.anton3.vkapi.vktypes.VkResponse

internal class VkResponseDeserializer(private val context: DeserializationContext) :
    StdDeserializer<VkResponse<*>>(weakType<VkResponse<*>>()) {

    override fun getValueType(): JavaType = context.contextualType
    private val wrappedType = valueType.containedType(0)
    private val errorType = strongType<VkError>()
    private val errorsType = strongType<List<VkError>>()

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkResponse<*> {
        val codec = p.codec as ObjectMapper
        val node = p.readNode<ObjectNode>()

        val response = node["response"]?.let {
            codec.reader(ctxt.forwardableAttributes).readValue<Any>(it.traverse(codec), wrappedType!!)!!
        }
        val error = node["error"]?.let {
            codec.readValue<VkError>(it.traverse(codec), errorType)!!
        }
        val executeErrors = node["execute_errors"]?.let {
            codec.readValue<List<VkError>>(it.traverse(codec), errorsType)!!
        }

        return VkResponse(response, error, executeErrors ?: emptyList())
    }

    companion object {
        fun builder() = ContextualDeserializerBuilder { VkResponseDeserializer(it) }
    }
}
