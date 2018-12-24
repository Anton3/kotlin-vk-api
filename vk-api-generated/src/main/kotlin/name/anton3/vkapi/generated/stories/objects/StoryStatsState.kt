package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class StoryStatsState(@JsonValue override val value: String) : Value<String> {
    ON("on"),
    OFF("off"),
    HIDDEN("hidden");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): StoryStatsState = parseEnum(value)
    }
}
