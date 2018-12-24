package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class LongPollFailure(@get:JsonValue val value: Int) {
    NEW_TS(1),
    REQUEST_NEW_KEY(2),
    REQUEST_NEW_KEY_TS(3),
    INVALID_VERSION(4)
}
