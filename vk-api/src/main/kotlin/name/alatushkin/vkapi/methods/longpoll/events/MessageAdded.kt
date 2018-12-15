package name.alatushkin.vkapi.methods.longpoll.events

import name.alatushkin.vkapi.methods.longpoll.objects.ExtraFields
import name.alatushkin.vkapi.methods.longpoll.objects.Flags

data class MessageAdded(
    override val eventType: Int,
    val messageId: Long,
    val flags: Flags,
    val extraFields: ExtraFields
) : LongPollEvent(eventType)
