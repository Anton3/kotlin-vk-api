package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class MarketItemAvailability(@JsonValue override val value: String) : Value<String> {
    AVAILABLE("0"),
    REMOVED("1"),
    UNAVAILABLE("2");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): MarketItemAvailability = parseEnum(value)
    }
}
