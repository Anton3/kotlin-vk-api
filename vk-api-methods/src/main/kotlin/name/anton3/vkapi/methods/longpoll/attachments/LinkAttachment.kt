package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

class LinkAttachment internal constructor(node: JsonNode, idx: Int) : Attachment(node, idx) {

    val photo: String? = prop(node, idx, "photo")?.textValue()
    val title: String? = prop(node, idx, "title")?.textValue()
    val description: String? = prop(node, idx, "desc")?.textValue()
    val url: String = prop(node, idx, "url")!!.textValue()

    override fun toString(): String {
        return "LinkAttachment(type=$type, id=$id, photo=$photo, title=\"$title\", description=\"$description\", url=\"$url\")"
    }
}
