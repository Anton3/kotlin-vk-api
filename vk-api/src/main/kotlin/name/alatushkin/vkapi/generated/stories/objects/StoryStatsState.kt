package name.alatushkin.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class StoryStatsState(@JsonValue val jsonValue: String) {
    ON("on"),
    OFF("off"),
    HIDDEN("hidden");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): StoryStatsState =
            StoryStatsState.values().find { it.jsonValue == value }!!
    }
}
