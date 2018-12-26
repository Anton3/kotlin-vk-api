package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.methods.longpoll.objects.Flags
import name.anton3.vkapi.vktypes.VkDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageAdded(
    override val eventType: Int,
    val messageId: Long,
    val flags: Flags,
    val peerId: Long?,
    val timestamp: VkDate?,
    val text: String?
) : LongPollEvent(eventType)
