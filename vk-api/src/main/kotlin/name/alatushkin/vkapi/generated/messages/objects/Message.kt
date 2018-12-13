package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.vktypes.VkDate

data class Message(
    val id: Long,
    val conversationMessageId: Long? = null,
    val date: VkDate,
    val peerId: Long,
    val fromId: Long,
    val updateTime: Long? = null,
    val randomId: Long? = null,
    val important: Boolean? = null,
    val payload: String? = null,
    val text: String,
    val attachments: List<MessageAttachment>? = null,
    val geo: Geo? = null,
    val action: MessageAction? = null,
    val keyboard: KeyboardReturned? = null
)
