package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@get:JsonValue val value: String) {
    OLD_FIRST("asc"),
    NEW_FIRST("desc")
}
