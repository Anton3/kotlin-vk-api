@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class StoryType(override val value: String) : ValueEnum<String> {
    PHOTO("photo"),
    VIDEO("video")
}
