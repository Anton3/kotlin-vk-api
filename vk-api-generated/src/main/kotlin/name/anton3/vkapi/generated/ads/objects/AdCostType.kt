package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AdCostType(@get:JsonValue val value: String) {
    PER_CLICKS("0"),
    PER_IMPRESSIONS("1")
}
