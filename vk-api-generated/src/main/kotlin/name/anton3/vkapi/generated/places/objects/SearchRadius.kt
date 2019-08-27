package name.anton3.vkapi.generated.places.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchRadius(@JsonValue override val value: Int) : Value<Int> {
    N_100_M(1),
    N_800_M(2),
    N_6_KM(3),
    N_50_KM(4);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): SearchRadius = parseEnum(value)
    }
}
