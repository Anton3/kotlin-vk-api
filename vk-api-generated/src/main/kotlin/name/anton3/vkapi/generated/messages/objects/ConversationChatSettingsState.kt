package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ConversationChatSettingsState(@get:JsonValue val value: String) {
    IN("in"),
    KICKED("kicked"),
    LEFT("left")
}
