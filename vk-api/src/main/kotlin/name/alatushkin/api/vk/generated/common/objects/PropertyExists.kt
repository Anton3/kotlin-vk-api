package name.alatushkin.api.vk.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class PropertyExists(@JsonValue val jsonValue: String) {
    PROPERTY_EXISTS("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PropertyExists =
            PropertyExists.values().find { it.jsonValue == value }!!
    }
}
