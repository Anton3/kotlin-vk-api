package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetCommentsSort(@JsonValue override val value: String) : Value<String> {
    OLD_FIRST("asc"),
    NEW_FIRST("desc");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetCommentsSort = parseEnum(value)
    }
}
