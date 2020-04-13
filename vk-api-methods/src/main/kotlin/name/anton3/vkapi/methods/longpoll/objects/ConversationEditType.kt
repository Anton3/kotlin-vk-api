package name.anton3.vkapi.methods.longpoll.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ConversationEditType(override val value: Int) : ValueEnum<Int> {
    TITLE_CHANGE(1),
    PHOTO_CHANGE(2),
    ADMIN_ADDED(3),
    UNKNOWN4(4),
    MESSAGE_PINNED(5),
    USER_JOINED(6),
    USER_EXITED(7),
    USER_KICKED(8),
    ADMIN_REMOVED(9),
    UNKNOWN10(10),
    UNKNOWN11(11),
    UNKNOWN17(17),
    UNKNOWN18(18)
}
