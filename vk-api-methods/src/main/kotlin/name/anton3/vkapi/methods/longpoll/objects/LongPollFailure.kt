package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class LongPollFailure(@get:JsonValue override val value: Int) : Value<Int> {
    NEW_TS(1),
    REQUEST_NEW_KEY(2),
    REQUEST_NEW_KEY_TS(3),
    INVALID_VERSION(4);

    companion object {
        @JvmStatic @JsonCreator(mode=JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): LongPollFailure = parseEnum(value)
    }
}
