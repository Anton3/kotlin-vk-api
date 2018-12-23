package name.anton3.vkapi.methods.longpoll.events

data class UserCalling(
    override val eventType: Int,
    val userId: Long,
    val chatId: Long
) : LongPollEvent(eventType)
