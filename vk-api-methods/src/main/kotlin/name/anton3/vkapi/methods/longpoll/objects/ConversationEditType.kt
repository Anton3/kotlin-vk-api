package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator

enum class ConversationEditType(val value: Int) {
    TITLE_CHANGE(1),
    PHOTO_CHANGE(2),
    ADMIN_ADDED(3),
    MESSAGE_PINNED(5),
    USER_JOINED(6),
    USER_EXITED(7),
    USER_KICKED(8),
    ADMIN_REMOVED(9);

    companion object {
        @JvmStatic
        @JsonCreator
        fun parse(value: Int): ConversationEditType {
            return ConversationEditType.values().find { it.value == value }!!
        }
    }
}
