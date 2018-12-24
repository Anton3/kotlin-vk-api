package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetCommentsSort(@JsonValue override val value: String) : Value<String> {
    OLD_TO_NEW("asc"),
    NEW_TO_OLD("desc");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetCommentsSort = parseEnum(value)
    }
}
