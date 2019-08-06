package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.methods.longpoll.objects.Attachments
import name.anton3.vkapi.methods.longpoll.objects.Flags
import name.anton3.vkapi.vktypes.VkDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageEdited(
    override val eventType: Int,
    val messageId: Int,
    val mask: Flags,
    val peerId: Int?,
    val timestamp: VkDate?,
    val text: String?,
    val extra: ExtraFields?,
    val attachments: Attachments = Attachments.EMPTY,
    val randomId: Int = 0
) : LongPollEvent(eventType)
