package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ConversationChatSettingsState(@JsonValue override val value: String) : Value<String> {
    IN("in"),
    KICKED("kicked"),
    LEFT("left");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): ConversationChatSettingsState = parseEnum(value)
    }
}
