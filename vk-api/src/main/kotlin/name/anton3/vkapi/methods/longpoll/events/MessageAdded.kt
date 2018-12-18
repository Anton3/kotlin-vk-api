package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.methods.longpoll.objects.ExtraFields
import name.anton3.vkapi.methods.longpoll.objects.Flags

data class MessageAdded(
    override val eventType: Int,
    val messageId: Long,
    val flags: Flags,
    val extraFields: ExtraFields
) : LongPollEvent(eventType)
