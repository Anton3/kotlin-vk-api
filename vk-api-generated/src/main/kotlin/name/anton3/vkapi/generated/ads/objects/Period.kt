package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Period(@JsonValue val jsonValue: String) {
    DAY("day"),
    MONTH("month"),
    OVERALL("overall");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Period =
            Period.values().find { it.jsonValue == value }!!
    }
}
