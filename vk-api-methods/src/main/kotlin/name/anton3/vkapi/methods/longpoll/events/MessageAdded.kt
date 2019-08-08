package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.methods.longpoll.attachments.Attachment
import name.anton3.vkapi.methods.longpoll.objects.ExtraFields
import name.anton3.vkapi.methods.longpoll.objects.Flags
import name.anton3.vkapi.vktypes.VkDate

data class MessageAdded(
    override val eventType: Int,
    val messageId: Int,
    val flags: Flags,
    val peerId: Int?,
    val timestamp: VkDate?,
    val text: String?,
    val extra: ExtraFields?,
    val attachments: List<Attachment>?,
    val randomId: Int = 0
) : LongPollEvent(eventType)
