package name.anton3.vkapi.generated.places.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchRadius(@JsonValue override val value: String) : Value<String> {
    M_100("1"),
    M_800("2"),
    KM_6("3"),
    KM_50("4");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): SearchRadius = parseEnum(value)
    }
}
