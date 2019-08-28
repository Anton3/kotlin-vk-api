@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ConversationPeerType(override val value: String) : ValueEnum<String> {
    USER("user"),
    CHAT("chat"),
    GROUP("group"),
    EMAIL("email")
}
