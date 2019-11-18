package name.anton3.vkapi.methods.longpoll.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ConversationEditType(override val value: Int) : ValueEnum<Int> {
    TITLE_CHANGE(1),
    PHOTO_CHANGE(2),
    ADMIN_ADDED(3),
    UNKNOWN(4),
    MESSAGE_PINNED(5),
    USER_JOINED(6),
    USER_EXITED(7),
    USER_KICKED(8),
    ADMIN_REMOVED(9),
    UNKNOWN2(10),
    UNKNOWN3(11),
    UNKNOWN4(18)
}
