@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Type(override val value: String) : ValueEnum<String> {
    INVITE("invite"),
    REQUEST("request")
}
