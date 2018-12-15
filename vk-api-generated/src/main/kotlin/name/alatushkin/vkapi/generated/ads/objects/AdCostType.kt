package name.alatushkin.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class AdCostType(@JsonValue val jsonValue: String) {
    PER_CLICKS("0"),
    PER_IMPRESSIONS("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AdCostType =
            AdCostType.values().find { it.jsonValue == value }!!
    }
}
