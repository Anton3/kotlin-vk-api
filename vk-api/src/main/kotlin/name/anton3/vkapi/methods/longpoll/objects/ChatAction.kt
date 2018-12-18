package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import java.io.IOException

enum class ChatAction(val value: String) {
    CREATED("chat_create"),
    TITLE_UPDATED("chat_title_update"),
    PHOTO_UPDATED("chat_photo_update"),
    USER_INVITED("chat_invite_user"),
    USER_KICKED("chat_kick_user");

    companion object {
        @JvmStatic
        @JsonCreator
        fun parse(value: String): ChatAction {
            return ChatAction.values().find { it.value == value } ?: throw IOException("Value not recognized")
        }
    }
}
