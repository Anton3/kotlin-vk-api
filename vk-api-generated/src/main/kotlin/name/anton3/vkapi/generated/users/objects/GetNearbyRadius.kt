package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetNearbyRadius(@JsonValue override val value: Int) : Value<Int> {
    ANY(0),
    N_300_M(1),
    N_2400_M(2),
    N_18_KM(3),
    N_150_KM(4);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GetNearbyRadius = parseEnum(value)
    }
}
