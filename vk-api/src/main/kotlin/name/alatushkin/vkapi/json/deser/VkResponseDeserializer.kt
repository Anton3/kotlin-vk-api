package name.alatushkin.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.type.TypeFactory
import name.alatushkin.vkapi.vktypes.VkError
import name.alatushkin.vkapi.vktypes.VkResponse
import name.alatushkin.vkapi.json.readNode
import name.alatushkin.vkapi.json.reader
import name.alatushkin.vkapi.json.strongType
import name.alatushkin.vkapi.json.weakType

class VkResponseDeserializer(context: DeserializationContext? = null) :
    StrongStdDeserializer<VkResponse<*>>(weakType(), context) {

    private val wrappedType = valueType.containedType(0)!!
    private val errorType = TypeFactory.defaultInstance().constructType(VkError::class.java)!!
    private val errorsType = strongType<List<VkError>>()

    override fun copy(context: DeserializationContext): VkResponseDeserializer =
        VkResponseDeserializer(context)

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkResponse<*> {
        val codec = p.codec as ObjectMapper
        val node = p.readNode<ObjectNode>()

        val response = node["response"]?.let {
            codec.reader(ctxt).readValue<Any>(it.traverse(codec), wrappedType)!!
        }
        val error = node["error"]?.let {
            codec.readValue<VkError>(it.traverse(codec), errorType)!!
        }
        val executeErrors = node["execute_errors"]?.let {
            codec.readValue<List<VkError>>(it.traverse(codec), errorsType)!!
        }

        return VkResponse(response, error, executeErrors ?: emptyList())
    }
}
