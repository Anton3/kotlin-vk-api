package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode
import name.anton3.vkapi.vktypes.parseEnum

abstract class Attachment internal constructor(node: JsonNode, idx: Int) {

    val type: AttachmentType = parseEnum(prop(node, idx, "type").textValue())
    val id: String = prop(node, idx, "").textValue()

    companion object {
        @JvmStatic
        protected fun prop(root: JsonNode, idx: Int, name: String): JsonNode {
            return root.get("attach" + idx + if (name.isNotEmpty()) "_$name" else "")
        }

        fun parse(node: JsonNode, idx: Int): Attachment {
            @Suppress("MoveVariableDeclarationIntoWhen")
            val type: AttachmentType = parseEnum(prop(node, idx, "type").textValue())

            return when (type) {
                AttachmentType.LINK -> LinkAttachment(node, idx)
                AttachmentType.DOC -> DocAttachment(node, idx)
                else -> GenericAttachment(node, idx)
            }
        }
    }
}
