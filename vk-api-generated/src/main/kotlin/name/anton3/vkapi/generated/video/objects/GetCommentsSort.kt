package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetCommentsSort(@JsonValue override val value: String) : Value<String> {
    OLDEST_COMMENT_FIRST("asc"),
    NEWEST_COMMENT_FIRST("desc");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetCommentsSort = parseEnum(value)
    }
}
