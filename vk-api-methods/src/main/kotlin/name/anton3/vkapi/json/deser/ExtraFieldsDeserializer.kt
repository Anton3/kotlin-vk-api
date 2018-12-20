package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.module.kotlin.convertValue
import name.anton3.vkapi.json.readNode
import name.anton3.vkapi.methods.longpoll.objects.Attachments
import name.anton3.vkapi.methods.longpoll.objects.ExtraFields
import name.anton3.vkapi.vktypes.VkDate

object ExtraFieldsDeserializer : StdDeserializer<ExtraFields>(ExtraFields::class.java) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ExtraFields {
        val codec = p.codec as ObjectMapper
        val node = p.readNode<ArrayNode>()

        val peerId = node.get(0).asLong()
        val timestamp = node.get(1).let { codec.convertValue<VkDate>(it) }
        val text = node.get(2).asText()

        val otherItems = node.drop(3)

        val randomId = otherItems.find { it.isIntegralNumber }?.asLong()?.takeIf { it != 0L }

        val additionalNode = otherItems.find { it.has("from") || it.has("title") }
        val attachmentNode = otherItems.find { it.isObject && !it.has("from") && !it.has("title") }

        val title = additionalNode?.get("title")?.asText()
        val fromId = additionalNode?.get("from")?.asLong()

        val attachments = (attachmentNode as? ObjectNode)?.let { Attachments.parse(it) }

        return ExtraFields(peerId, timestamp, text, randomId, title, fromId, attachments ?: Attachments.EMPTY)
    }
}
