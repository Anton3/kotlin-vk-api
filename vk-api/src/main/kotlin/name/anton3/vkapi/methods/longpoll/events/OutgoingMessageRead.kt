package name.anton3.vkapi.methods.longpoll.events

data class OutgoingMessageRead(
    override val eventType: Int,
    val peerId: Long,
    val localId: Long
) : LongPollEvent(eventType)
