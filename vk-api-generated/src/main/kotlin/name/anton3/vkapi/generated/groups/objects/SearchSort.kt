package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchSort(@JsonValue override val value: String) : Value<String> {
    DEFAULT("0"),
    GROWTH("1"),
    ATTENDANCE("2"),
    LIKES("3"),
    COMMENTS("4"),
    ENTRIES("5");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): SearchSort = parseEnum(value)
    }
}
