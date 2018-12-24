package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class IgnoreItemType(@JsonValue override val value: String) : Value<String> {
    POST_ON_THE_WALL("wall"),
    TAG_ON_A_PHOTO("tag"),
    PROFILE_PHOTO("profilephoto"),
    VIDEO("video"),
    AUDIO("audio");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): IgnoreItemType = parseEnum(value)
    }
}
