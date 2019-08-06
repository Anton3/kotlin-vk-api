package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

class GenericAttachment internal constructor(node: JsonNode, idx: Int) : Attachment(node, idx) {
    override fun toString(): String = "Attachment(type=$type, id=$id)"
}
