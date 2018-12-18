package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class AdStatus(@JsonValue val jsonValue: String) {
    STOPPED("0"),
    STARTED("1"),
    DELETED("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AdStatus =
            AdStatus.values().find { it.jsonValue == value }!!
    }
}
