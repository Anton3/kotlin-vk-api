package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetLinkStatsInterval(@JsonValue val jsonValue: String) {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    FOREVER("forever");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetLinkStatsInterval =
            GetLinkStatsInterval.values().find { it.jsonValue == value }!!
    }
}
