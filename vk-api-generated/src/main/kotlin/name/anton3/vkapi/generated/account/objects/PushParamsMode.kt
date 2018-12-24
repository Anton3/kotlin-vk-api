package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class PushParamsMode(@JsonValue override val value: String) : Value<String> {
    ON("on"),
    OFF("off"),
    NO_SOUND("no_sound"),
    NO_TEXT("no_text");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): PushParamsMode = parseEnum(value)
    }
}
