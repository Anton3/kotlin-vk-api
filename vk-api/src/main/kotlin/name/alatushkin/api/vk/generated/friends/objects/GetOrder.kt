package name.alatushkin.api.vk.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetOrder(@JsonValue val jsonValue: String) {
    NAME("name"),
    HINTS("hints");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetOrder =
            GetOrder.values().find { it.jsonValue == value }!!
    }
}
