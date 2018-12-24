package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ChatAction(@get:JsonValue val value: String) {
    CREATED("chat_create"),
    TITLE_UPDATED("chat_title_update"),
    PHOTO_UPDATED("chat_photo_update"),
    USER_INVITED("chat_invite_user"),
    USER_KICKED("chat_kick_user")
}
