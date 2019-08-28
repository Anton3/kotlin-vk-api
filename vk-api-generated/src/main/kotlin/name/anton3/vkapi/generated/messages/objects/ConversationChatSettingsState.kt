@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ConversationChatSettingsState(override val value: String) : ValueEnum<String> {
    IN("in"),
    KICKED("kicked"),
    LEFT("left")
}
