@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ItemStoriesBlockBlockType(override val value: String) : ValueEnum<String> {
    LOCAL("local"),
    REMOTE("remote")
}
