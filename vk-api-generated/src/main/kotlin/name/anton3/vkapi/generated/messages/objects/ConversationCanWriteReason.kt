package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ConversationCanWriteReason(@JsonValue val jsonValue: String) {
    USER_DELETED("18"),
    USER_IS_BLACKLISTED("900"),
    USER_BLACKLISTED_COMMUNITY("901"),
    USER_BLOCKED_MESSAGES("902"),
    COMMUNITY_DISABLED_MESSAGES("915"),
    COMMUNITY_BLOCKED_MESSAGES("916"),
    NO_CONVERSATION_ACCESS("917"),
    NO_EMAIL_ACCESS("918"),
    NO_COMMUNITY_ACCESS("203");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ConversationCanWriteReason =
            ConversationCanWriteReason.values().find { it.jsonValue == value }!!
    }
}
