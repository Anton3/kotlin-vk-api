package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.common.objects.Geo
import name.alatushkin.api.vk.vktypes.VkDate

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
