package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class MessageActionStatus(@JsonValue override val value: String) : Value<String> {
    CHAT_PHOTO_UPDATE("chat_photo_update"),
    CHAT_PHOTO_REMOVE("chat_photo_remove"),
    CHAT_CREATE("chat_create"),
    CHAT_TITLE_UPDATE("chat_title_update"),
    CHAT_INVITE_USER("chat_invite_user"),
    CHAT_KICK_USER("chat_kick_user"),
    CHAT_PIN_MESSAGE("chat_pin_message"),
    CHAT_UNPIN_MESSAGE("chat_unpin_message"),
    CHAT_INVITE_USER_BY_LINK("chat_invite_user_by_link");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): MessageActionStatus = parseEnum(value)
    }
}
