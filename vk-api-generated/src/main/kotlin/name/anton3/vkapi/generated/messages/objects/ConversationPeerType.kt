package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ConversationPeerType(@JsonValue val jsonValue: String) {
    USER("user"),
    CHAT("chat"),
    GROUP("group"),
    EMAIL("email");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ConversationPeerType =
            ConversationPeerType.values().find { it.jsonValue == value }!!
    }
}
