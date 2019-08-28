@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class CreateType(override val value: String) : ValueEnum<String> {
    GROUP("group"),
    PUBLIC("public"),
    EVENT("event")
}
