package name.alatushkin.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Type(@JsonValue val jsonValue: String) {
    REQUEST("request"),
    INVITE("invite");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Type =
            Type.values().find { it.jsonValue == value }!!
    }
}
