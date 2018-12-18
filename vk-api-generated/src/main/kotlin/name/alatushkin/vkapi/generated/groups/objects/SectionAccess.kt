package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SectionAccess(@JsonValue val jsonValue: String) {
    DISABLED("0"),
    OPEN("1"),
    LIMITED("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SectionAccess =
            SectionAccess.values().find { it.jsonValue == value }!!
    }
}
