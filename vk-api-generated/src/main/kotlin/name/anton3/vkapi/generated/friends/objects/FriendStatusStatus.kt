package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class FriendStatusStatus(@JsonValue override val value: Int) : Value<Int> {
    NOT_A_FRIEND(0),
    OUTCOMING_REQUEST(1),
    INCOMING_REQUEST(2),
    IS_FRIEND(3);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): FriendStatusStatus = parseEnum(value)
    }
}
