package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ConversationEditType(@get:JsonValue val value: Int) {
    TITLE_CHANGE(1),
    PHOTO_CHANGE(2),
    ADMIN_ADDED(3),
    MESSAGE_PINNED(5),
    USER_JOINED(6),
    USER_EXITED(7),
    USER_KICKED(8),
    ADMIN_REMOVED(9)
}
