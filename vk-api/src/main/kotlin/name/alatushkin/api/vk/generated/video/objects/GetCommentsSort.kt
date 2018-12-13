package name.alatushkin.api.vk.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@JsonValue val jsonValue: String) {
    OLDEST_COMMENT_FIRST("asc"),
    NEWEST_COMMENT_FIRST("desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetCommentsSort =
            GetCommentsSort.values().find { it.jsonValue == value }!!
    }
}
