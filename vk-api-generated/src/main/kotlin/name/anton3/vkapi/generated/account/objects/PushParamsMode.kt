@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class PushParamsMode(override val value: String) : ValueEnum<String> {
    ON("on"),
    OFF("off"),
    NO_SOUND("no_sound"),
    NO_TEXT("no_text")
}
