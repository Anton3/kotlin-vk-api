package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@get:JsonValue val value: String) {
    OLDEST_COMMENT_FIRST("asc"),
    NEWEST_COMMENT_FIRST("desc")
}
