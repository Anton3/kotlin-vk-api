package name.alatushkin.api.vk.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class BoolInt(@JsonValue val jsonValue: String) {
    NO("0"),
    YES("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): BoolInt =
            BoolInt.values().find { it.jsonValue == value }!!
    }
}
