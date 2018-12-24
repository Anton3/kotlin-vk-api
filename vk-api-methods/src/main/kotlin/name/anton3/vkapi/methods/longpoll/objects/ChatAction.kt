package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ChatAction(@JsonValue override val value: String) : Value<String> {
    CREATED("chat_create"),
    TITLE_UPDATED("chat_title_update"),
    PHOTO_UPDATED("chat_photo_update"),
    USER_INVITED("chat_invite_user"),
    USER_KICKED("chat_kick_user");

    companion object {
        @JvmStatic @JsonCreator(mode=JsonCreator.Mode.DELEGATING)
        fun parse(value: String): ChatAction = parseEnum(value)
    }
}
