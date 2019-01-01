package name.anton3.vkapi.methods.longpoll.events

data class UserTypingInChat(
    override val eventType: Int,
    val userId: Int,
    val chatId: Int
) : LongPollEvent(eventType)
