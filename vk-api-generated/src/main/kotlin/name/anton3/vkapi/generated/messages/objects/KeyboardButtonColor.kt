package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class KeyboardButtonColor(@JsonValue override val value: String) : Value<String> {
    DEFAULT("default"),
    POSITIVE("positive"),
    NEGATIVE("negative"),
    PRIMARY("primary");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): KeyboardButtonColor = parseEnum(value)
    }
}
