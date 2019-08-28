@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class StoryStatsState(override val value: String) : ValueEnum<String> {
    ON("on"),
    OFF("off"),
    HIDDEN("hidden")
}
