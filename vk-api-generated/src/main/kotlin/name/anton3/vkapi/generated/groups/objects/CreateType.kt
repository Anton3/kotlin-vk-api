package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CreateType(@JsonValue override val value: String) : Value<String> {
    GROUP("group"),
    PUBLIC("public"),
    EVENT("event");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CreateType = parseEnum(value)
    }
}
