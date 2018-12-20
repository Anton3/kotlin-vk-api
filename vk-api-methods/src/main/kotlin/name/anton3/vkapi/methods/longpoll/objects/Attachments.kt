package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.node.ObjectNode
import name.anton3.vkapi.methods.longpoll.attachments.Attachment
import name.anton3.vkapi.methods.longpoll.attachments.AttachmentType

data class Attachments(
    val attachments: List<Attachment>,
    val sourceAct: ChatAction?,
    val sourceMid: Long?,
    val fromAdmin: Long?,
    val geo: Boolean,
    val emoji: Boolean
) {
    companion object {
        @JvmStatic
        @JsonCreator
        fun parse(node: ObjectNode): Attachments {
            val geo = node.has("geo")
            val emoji = node.has("emoji")

            val fromAdminNode = node["from_admin"]
            val fromAdmin = fromAdminNode?.asLong()?.takeIf { fromAdminNode.isIntegralNumber }

            val sourceActNode = node["source_act"]
            val sourceAct = sourceActNode?.asText()?.takeIf { sourceActNode.isTextual }
                ?.let { ChatAction.parse(it) }

            val sourceMidNode = node["source_mid"]
            val sourceMid = sourceMidNode?.asLong()?.takeIf { sourceMidNode.isIntegralNumber }

            val attachments = generateSequence(1) { it + 1 }
                .takeWhile { node.has("attach$it") }
                .mapNotNull { idx ->
                    val attachId = node.get("attach${idx}_type").asText()
                    AttachmentType.fromStringId(attachId)?.readFromJson(node, idx)
                }
                .toList()

            return Attachments(attachments, sourceAct, sourceMid, fromAdmin, geo, emoji)
        }

        val EMPTY = Attachments(emptyList(), null, null, null, false, false)
    }
}
