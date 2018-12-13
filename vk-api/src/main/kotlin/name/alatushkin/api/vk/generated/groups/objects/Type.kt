package name.alatushkin.api.vk.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Type(@JsonValue val jsonValue: String) {
    GROUP("group"),
    PAGE("page"),
    EVENT("event");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Type =
            Type.values().find { it.jsonValue == value }!!
    }
}
