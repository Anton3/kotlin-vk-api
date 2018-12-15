package name.alatushkin.vkapi.methods.longpoll.events

data class IncomingMessageRead(
    override val eventType: Int,
    val peerId: Long,
    val localId: Long
) : LongPollEvent(eventType)
