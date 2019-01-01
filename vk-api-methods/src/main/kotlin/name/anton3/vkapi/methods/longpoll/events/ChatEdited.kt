package name.anton3.vkapi.methods.longpoll.events

data class ChatEdited(
    override val eventType: Int,
    val chatId: Int,
    val self: Boolean
) : LongPollEvent(eventType)
