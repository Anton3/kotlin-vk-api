package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class BanInfoReason(@JsonValue override val value: Int) : Value<Int> {
    OTHER(0),
    SPAM(1),
    VERBAL_ABUSE(2),
    STRONG_LANGUAGE(3),
    FLOOD(4);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): BanInfoReason = parseEnum(value)
    }
}
