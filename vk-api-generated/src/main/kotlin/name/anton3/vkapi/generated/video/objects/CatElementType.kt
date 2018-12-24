package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CatElementType(@get:JsonValue val value: String) {
    VIDEO("video"),
    ALBUM("album")
}
