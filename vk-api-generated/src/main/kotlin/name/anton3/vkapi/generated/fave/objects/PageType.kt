@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class PageType(override val value: String) : ValueEnum<String> {
    USER("user"),
    GROUP("group"),
    HINTS("hints")
}
