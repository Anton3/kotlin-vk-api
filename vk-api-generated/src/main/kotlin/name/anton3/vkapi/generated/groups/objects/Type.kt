@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Type(override val value: String) : ValueEnum<String> {
    GROUP("group"),
    PAGE("page"),
    EVENT("event")
}
