package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class BanUserReason(@JsonValue override val value: Int) : Value<Int> {
    OTHER(0),
    SPAM(1),
    VERBAL_ABUSE(2),
    STRONG_LANGUAGE(3),
    IRRELEVANT_MESSAGES(4);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): BanUserReason = parseEnum(value)
    }
}
