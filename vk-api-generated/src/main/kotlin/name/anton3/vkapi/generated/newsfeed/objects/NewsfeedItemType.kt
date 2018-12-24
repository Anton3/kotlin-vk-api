package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class NewsfeedItemType(@JsonValue override val value: String) : Value<String> {
    POST("post"),
    PHOTO("photo"),
    PHOTO_TAG("photo_tag"),
    WALL_PHOTO("wall_photo"),
    FRIEND("friend"),
    NOTE("note"),
    AUDIO("audio"),
    VIDEO("video"),
    TOPIC("topic");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): NewsfeedItemType = parseEnum(value)
    }
}
