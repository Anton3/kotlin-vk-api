package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@get:JsonValue val value: String) {
    CHRONOLOGICAL("asc"),
    REVERSE_CHRONOLOGICAL("desc")
}
