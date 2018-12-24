package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class Type(@JsonValue override val value: String) : Value<String> {
    REQUEST("request"),
    INVITE("invite");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): Type = parseEnum(value)
    }
}
