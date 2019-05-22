package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

open class Attachment internal constructor(node: JsonNode, idx: Int) {

    val type: String = prop(node, idx, "type").textValue()
    val id: String = prop(node, idx, "").textValue()

    override fun toString(): String = "Attachment(type=$type, id=$id)"

    companion object {
        @JvmStatic
        protected fun prop(root: JsonNode, idx: Int, name: String): JsonNode {
            return root.get("attach" + idx + if (name.isNotEmpty()) "_$name" else "")
        }
    }
}
