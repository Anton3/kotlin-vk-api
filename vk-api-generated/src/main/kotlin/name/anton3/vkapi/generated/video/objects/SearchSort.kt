package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchSort(@JsonValue override val value: Int) : Value<Int> {
    DURATION(1),
    RELEVANCE(2),
    DATE_ADDED(0);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): SearchSort = parseEnum(value)
    }
}
