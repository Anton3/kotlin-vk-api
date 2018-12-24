package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchSort(@JsonValue override val value: String) : Value<String> {
    BY_RATING("0"),
    BY_DATE_REGISTERED("1");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): SearchSort = parseEnum(value)
    }
}
