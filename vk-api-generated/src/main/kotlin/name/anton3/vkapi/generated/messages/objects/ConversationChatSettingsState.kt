package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ConversationChatSettingsState(@JsonValue val jsonValue: String) {
    IN("in"),
    KICKED("kicked"),
    LEFT("left");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ConversationChatSettingsState =
            ConversationChatSettingsState.values().find { it.jsonValue == value }!!
    }
}
