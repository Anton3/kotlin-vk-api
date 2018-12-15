package name.alatushkin.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Visibility(@JsonValue val jsonValue: String) {
    OPEN("0"),
    CLOSED("1"),
    PRIVATE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Visibility =
            Visibility.values().find { it.jsonValue == value }!!
    }
}
