package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.node.ObjectNode
import name.anton3.vkapi.methods.longpoll.attachments.Attachment

class Attachments(private val attachments: List<Attachment>) : List<Attachment> by attachments {
    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(node: ObjectNode): Attachments {
            return generateSequence(1) { it + 1 }
                .takeWhile { node.has("attach$it") }
                .map { idx -> Attachment.parse(node, idx) }
                .toList()
                .let { Attachments(it) }
        }
    }
}
