package name.alatushkin.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class CreateType(@JsonValue val jsonValue: String) {
    GROUP("group"),
    PUBLIC("public"),
    EVENT("event");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CreateType =
            CreateType.values().find { it.jsonValue == value }!!
    }
}
