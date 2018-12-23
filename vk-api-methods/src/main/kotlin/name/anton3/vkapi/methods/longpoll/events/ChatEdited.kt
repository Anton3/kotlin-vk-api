package name.anton3.vkapi.methods.longpoll.events

data class ChatEdited(
    override val eventType: Int,
    val chatId: Long,
    val self: Boolean
) : LongPollEvent(eventType)
