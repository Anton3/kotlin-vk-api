package name.anton3.vkapi.generated.likes.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Type(@JsonValue val jsonValue: String) {
    POST("post"),
    COMMENT("comment"),
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),
    NOTE("note"),
    PHOTO_COMMENT("photo_comment"),
    VIDEO_COMMENT("video_comment"),
    TOPIC_COMMENT("topic_comment"),
    SITEPAGE("sitepage");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Type =
            Type.values().find { it.jsonValue == value }!!
    }
}
