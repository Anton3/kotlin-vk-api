package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AdLayoutCostType(@JsonValue override val value: String) : Value<String> {
    PER_CLICKS("0"),
    PER_IMPRESSIONS("1");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): AdLayoutCostType = parseEnum(value)
    }
}
