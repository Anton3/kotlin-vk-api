package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GroupFullMemberStatus(@JsonValue override val value: Int) : Value<Int> {
    NOT_A_MEMBER(0),
    MEMBER(1),
    NOT_SURE(2),
    DECLINED(3),
    HAS_SENT_A_REQUEST(4),
    INVITED(5);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GroupFullMemberStatus = parseEnum(value)
    }
}
