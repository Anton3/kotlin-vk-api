package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class MarketItemAvailability(@get:JsonValue val value: String) {
    AVAILABLE("0"),
    REMOVED("1"),
    UNAVAILABLE("2")
}
