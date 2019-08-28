package name.anton3.vkapi.methods.longpoll.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class LongPollFailure(override val value: Int) : ValueEnum<Int> {
    NEW_TS(1),
    REQUEST_NEW_KEY(2),
    REQUEST_NEW_KEY_TS(3),
    INVALID_VERSION(4)
}
