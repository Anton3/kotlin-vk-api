package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class KeyboardButtonActionType(@JsonValue override val value: String) : Value<String> {
    TEXT("text"),
    START("start");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): KeyboardButtonActionType = parseEnum(value)
    }
}
