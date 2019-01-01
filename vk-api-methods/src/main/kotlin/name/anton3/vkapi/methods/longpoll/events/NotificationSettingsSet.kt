package name.anton3.vkapi.methods.longpoll.events

data class NotificationSettingsSet(
    override val eventType: Int,
    val peerId: Int,
    val sound: Boolean,
    val disabledUntil: Int
) : LongPollEvent(eventType) {

    companion object {
        const val ENABLED = 0L
        const val FOREVER = -1L
    }
}
