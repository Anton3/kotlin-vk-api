package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

class DocAttachment internal constructor(node: JsonNode, idx: Int) : Attachment(node, idx) {

    val kind: String? = prop(node, idx, "kind")?.textValue()

    override fun toString(): String = "DocAttachment(type=$type, id=$id, kind=$kind)"
}
