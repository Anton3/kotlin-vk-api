package name.anton3.vkapi.generated.widgets.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CommentMediaType(@get:JsonValue val value: String) {
    AUDIO("audio"),
    PHOTO("photo"),
    VIDEO("video")
}
