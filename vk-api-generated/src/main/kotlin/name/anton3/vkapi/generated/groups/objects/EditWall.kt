package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class EditWall(@JsonValue override val value: String) : Value<String> {
    DISABLED("0"),
    OPEN("1"),
    LIMITED("2"),
    CLOSED("3");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): EditWall = parseEnum(value)
    }
}
