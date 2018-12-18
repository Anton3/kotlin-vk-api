package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class StatsSexValue(@JsonValue val jsonValue: String) {
    FEMALE("f"),
    MALE("m");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): StatsSexValue =
            StatsSexValue.values().find { it.jsonValue == value }!!
    }
}
