package name.alatushkin.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonUnwrapped
import name.alatushkin.vkapi.methods.longpoll.objects.ExtraFields
import name.alatushkin.vkapi.methods.longpoll.objects.Flags

data class MessageFlagsUnset(
    override val eventType: Int,
    val messageId: Long,
    val mask: Flags,
    @JsonUnwrapped val extra: ExtraFields
) : LongPollEvent(eventType)
