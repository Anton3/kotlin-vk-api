@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ItemDigestTemplate(override val value: String) : ValueEnum<String> {
    LIST("list"),
    GRID("grid")
}
