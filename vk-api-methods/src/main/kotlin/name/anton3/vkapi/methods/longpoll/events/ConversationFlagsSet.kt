package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.methods.longpoll.objects.Flags

data class ConversationFlagsSet(
    override val eventType: Int,
    val mask: Flags
) : LongPollEvent(eventType)
