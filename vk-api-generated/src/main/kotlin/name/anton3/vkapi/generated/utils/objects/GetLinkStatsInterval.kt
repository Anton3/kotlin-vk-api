package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetLinkStatsInterval(@get:JsonValue val value: String) {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    FOREVER("forever")
}
