package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@JsonValue val jsonValue: String) {
    CHRONOLOGICAL("asc"),
    REVERSE_CHRONOLOGICAL("desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetCommentsSort =
            GetCommentsSort.values().find { it.jsonValue == value }!!
    }
}
