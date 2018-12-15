package name.alatushkin.vkapi.generated.pages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Access(@JsonValue val jsonValue: String) {
    MANAGERS("0"),
    MEMBERS("1"),
    ALL("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Access =
            Access.values().find { it.jsonValue == value }!!
    }
}
