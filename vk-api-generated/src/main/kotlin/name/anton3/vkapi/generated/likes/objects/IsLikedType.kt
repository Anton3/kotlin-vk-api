package name.anton3.vkapi.generated.likes.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class IsLikedType(@JsonValue override val value: String) : Value<String> {
    POST("post"),
    COMMENT("comment"),
    PHOTO("photo"),
    AUDIO("audio"),
    VIDEO("video"),
    NOTE("note"),
    PHOTO_COMMENT("photo_comment"),
    VIDEO_COMMENT("video_comment"),
    TOPIC_COMMENT("topic_comment");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): IsLikedType = parseEnum(value)
    }
}
