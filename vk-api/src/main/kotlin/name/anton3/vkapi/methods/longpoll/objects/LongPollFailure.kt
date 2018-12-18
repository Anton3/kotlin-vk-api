package name.anton3.vkapi.methods.longpoll.objects

enum class LongPollFailure(val value: Int) {
    NEW_TS(1),
    REQUEST_NEW_KEY(2),
    REQUEST_NEW_KEY_TS(3),
    INVALID_VERSION(4)
}
