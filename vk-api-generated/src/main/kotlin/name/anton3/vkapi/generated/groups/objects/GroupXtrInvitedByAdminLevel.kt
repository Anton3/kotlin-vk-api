package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GroupXtrInvitedByAdminLevel(@JsonValue override val value: Int) : Value<Int> {
    MODERATOR(1),
    EDITOR(2),
    ADMINISTRATOR(3);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GroupXtrInvitedByAdminLevel = parseEnum(value)
    }
}
