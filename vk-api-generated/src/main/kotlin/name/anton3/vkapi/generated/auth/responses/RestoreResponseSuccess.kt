package name.anton3.vkapi.generated.auth.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class RestoreResponseSuccess(@JsonValue override val value: String) : Value<String> {
    OK("1");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): RestoreResponseSuccess = parseEnum(value)
    }
}
