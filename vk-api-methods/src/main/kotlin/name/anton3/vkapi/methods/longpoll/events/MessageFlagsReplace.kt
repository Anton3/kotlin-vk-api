package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.methods.longpoll.objects.Flags
import name.anton3.vkapi.vktypes.VkDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageFlagsReplace(
    override val eventType: Int,
    val messageId: Int,
    val flags: Flags,
    val peerId: Int?,
    val timestamp: VkDate?,
    val text: String?
) : LongPollEvent(eventType)
