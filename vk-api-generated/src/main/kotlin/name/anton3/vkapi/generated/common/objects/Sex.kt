package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class Sex(@JsonValue override val value: String) : Value<String> {
    UNKNOWN("0"),
    FEMALE("1"),
    MALE("2");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): Sex = parseEnum(value)
    }
}
