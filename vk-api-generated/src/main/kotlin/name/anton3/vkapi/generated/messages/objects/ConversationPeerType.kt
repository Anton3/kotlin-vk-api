package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ConversationPeerType(@get:JsonValue val value: String) {
    USER("user"),
    CHAT("chat"),
    GROUP("group"),
    EMAIL("email")
}
