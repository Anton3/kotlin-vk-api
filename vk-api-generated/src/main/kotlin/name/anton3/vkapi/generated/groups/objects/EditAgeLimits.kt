package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class EditAgeLimits(@JsonValue override val value: Int) : Value<Int> {
    UNLIMITED(1),
    N_16_PLUS(2),
    N_18_PLUS(3);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): EditAgeLimits = parseEnum(value)
    }
}
