package name.alatushkin.vkapi.methods.longpoll.events

import name.alatushkin.vkapi.methods.longpoll.objects.ExtraFields
import name.alatushkin.vkapi.methods.longpoll.objects.Flags

data class MessageEdited(
    override val eventType: Int,
    val messageId: Long,
    val mask: Flags,
    val extraFields: ExtraFields
) : LongPollEvent(eventType)
