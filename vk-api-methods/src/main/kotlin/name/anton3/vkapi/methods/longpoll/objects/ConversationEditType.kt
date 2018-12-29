package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ConversationEditType(@get:JsonValue override val value: Int) : Value<Int> {
    TITLE_CHANGE(1),
    PHOTO_CHANGE(2),
    ADMIN_ADDED(3),
    UNKNOWN(4),  // Not described in spec, but happens
    MESSAGE_PINNED(5),
    USER_JOINED(6),
    USER_EXITED(7),
    USER_KICKED(8),
    ADMIN_REMOVED(9),
    UNKNOWN2(10),  // Not described in spec, but happens
    UNKNOWN3(11);  // Not described in spec, but happens

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): ConversationEditType = parseEnum(value)
    }
}
