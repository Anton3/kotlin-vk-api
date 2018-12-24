package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchSort(@JsonValue override val value: String) : Value<String> {
    DURATION("1"),
    RELEVANCE("2"),
    DATE_ADDED("0");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): SearchSort = parseEnum(value)
    }
}
