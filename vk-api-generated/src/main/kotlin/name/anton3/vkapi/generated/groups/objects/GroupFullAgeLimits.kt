package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GroupFullAgeLimits(@JsonValue override val value: Int) : Value<Int> {
    NO(1),
    OVER_16(2),
    OVER_18(3);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GroupFullAgeLimits = parseEnum(value)
    }
}
