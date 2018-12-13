package name.alatushkin.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode
import mu.KotlinLogging

private val log = KotlinLogging.logger {}

enum class Type(internal var typeId: String) {
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),
    LINK("link") {
        override fun readFromJson(node: JsonNode, idx: Int): Attachment {
            return Link(node, idx)
        }
    },
    DOC("doc") {
        override fun readFromJson(node: JsonNode, idx: Int) =
            DocAttachment(node, idx)
    };

    open fun readFromJson(node: JsonNode, idx: Int): Attachment {
        return Attachment(node, idx)
    }

    companion object {
        fun fromStringId(id: String): Type? {
            val result = values().find { type -> type.typeId == id }
            if (result == null)
                log.warn("Unknown attachment type {}", id)
            return result
        }
    }
}
