package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.methods.longpoll.objects.Attachments
import name.anton3.vkapi.methods.longpoll.objects.Flags
import name.anton3.vkapi.vktypes.VkDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageAdded(
    override val eventType: Int,
    val messageId: Int,
    val flags: Flags,
    val peerId: Int?,
    val timestamp: VkDate?,
    val text: String?,
    val extra: ExtraFields?,
    val attachments: Attachments?,
    val randomId: Int = 0
) : LongPollEvent(eventType)
