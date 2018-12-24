package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class PushParamsSettings(@JsonValue override val value: String) : Value<String> {
    ON("on"),
    OFF("off"),
    FR_OF_FR("fr_of_fr");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): PushParamsSettings = parseEnum(value)
    }
}
