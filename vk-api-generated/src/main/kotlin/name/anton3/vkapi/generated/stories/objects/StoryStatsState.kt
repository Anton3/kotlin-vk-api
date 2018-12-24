package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class StoryStatsState(@get:JsonValue val value: String) {
    ON("on"),
    OFF("off"),
    HIDDEN("hidden")
}
