package name.anton3.vkapi.generated.auth.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ConfirmResponseSuccess(@JsonValue override val value: Int) : Value<Int> {
    OK(1);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): ConfirmResponseSuccess = parseEnum(value)
    }
}
