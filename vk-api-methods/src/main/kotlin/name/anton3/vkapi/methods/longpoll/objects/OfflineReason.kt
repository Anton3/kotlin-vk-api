package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class OfflineReason(@JsonValue override val value: Int) : Value<Int> {
    LEAVING(0),
    TIMEOUT(1);

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: Int): OfflineReason = parseEnum(value)
    }
}
