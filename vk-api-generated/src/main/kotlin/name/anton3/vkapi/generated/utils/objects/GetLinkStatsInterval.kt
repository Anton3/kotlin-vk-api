package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetLinkStatsInterval(@JsonValue override val value: String) : Value<String> {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    FOREVER("forever");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetLinkStatsInterval = parseEnum(value)
    }
}
