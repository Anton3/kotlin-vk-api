package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.methods.longpoll.objects.Flags

data class ConversationFlagsReplace(
    override val eventType: Int,
    val flags: Flags
) : LongPollEvent(eventType)
