package name.alatushkin.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

enum class AttachmentType(internal var typeId: String) {
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),

    LINK("link") {
        override fun readFromJson(node: JsonNode, idx: Int): Attachment = LinkAttachment(node, idx)
    },

    DOC("doc") {
        override fun readFromJson(node: JsonNode, idx: Int) = DocAttachment(node, idx)
    };

    open fun readFromJson(node: JsonNode, idx: Int): Attachment = Attachment(node, idx)

    companion object {
        fun fromStringId(id: String): AttachmentType? {
            return values().find { type -> type.typeId == id }
        }
    }
}
