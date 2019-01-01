package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.methods.longpoll.objects.Flags

data class UserTypingInConversation(
    override val eventType: Int,
    val userId: Int,
    val flags: Flags
) : LongPollEvent(eventType)
