package name.anton3.vkapi.methods.longpoll.events

data class IncomingMessageRead(
    override val eventType: Int,
    val peerId: Int,
    val localId: Int
) : LongPollEvent(eventType)
