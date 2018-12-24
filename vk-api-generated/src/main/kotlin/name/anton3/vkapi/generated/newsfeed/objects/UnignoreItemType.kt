package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class UnignoreItemType(@JsonValue override val value: String) : Value<String> {
    WALL("wall"),
    TAG("tag"),
    PROFILEPHOTO("profilephoto"),
    VIDEO("video"),
    AUDIO("audio");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): UnignoreItemType = parseEnum(value)
    }
}
