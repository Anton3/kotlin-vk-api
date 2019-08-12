package name.anton3.vkapi.methods.longpoll.events

data class NotificationSettingsSet(
    override val eventType: Int,
    val peerId: Int,
    val sound: Boolean,
    val disabledUntil: Int
) : LongPollEvent(eventType) {

    companion object {
        const val ENABLED: Long = 0L
        const val FOREVER: Long = -1L
    }
}
