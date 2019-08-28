@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class KeyboardButtonColor(override val value: String) : ValueEnum<String> {
    DEFAULT("default"),
    POSITIVE("positive"),
    NEGATIVE("negative"),
    PRIMARY("primary")
}
