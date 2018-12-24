package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class EditAgeLimits(@JsonValue override val value: String) : Value<String> {
    UNLIMITED("1"),
    PLUS_16("2"),
    PLUS_18("3");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): EditAgeLimits = parseEnum(value)
    }
}
