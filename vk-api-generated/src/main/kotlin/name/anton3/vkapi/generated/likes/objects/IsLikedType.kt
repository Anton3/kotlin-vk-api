package name.anton3.vkapi.generated.likes.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class IsLikedType(@get:JsonValue val value: String) {
    POST("post"),
    COMMENT("comment"),
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),
    NOTE("note"),
    PHOTO_COMMENT("photo_comment"),
    VIDEO_COMMENT("video_comment"),
    TOPIC_COMMENT("topic_comment")
}
