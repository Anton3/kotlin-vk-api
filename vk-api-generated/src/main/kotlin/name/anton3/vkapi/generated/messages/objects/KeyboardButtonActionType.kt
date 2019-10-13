@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class KeyboardButtonActionType(override val value: String) : ValueEnum<String> {
    TEXT("text"),
    START("start"),
    LOCATION("location"),
    VKPAY("vkpay"),
    OPEN_APP("open_app")
}
