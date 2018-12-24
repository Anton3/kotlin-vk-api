package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class StoryType(@JsonValue override val value: String) : Value<String> {
    PHOTO("photo"),
    VIDEO("video");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): StoryType = parseEnum(value)
    }
}
