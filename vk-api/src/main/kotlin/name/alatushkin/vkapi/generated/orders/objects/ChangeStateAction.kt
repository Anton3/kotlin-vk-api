package name.alatushkin.vkapi.generated.orders.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ChangeStateAction(@JsonValue val jsonValue: String) {
    CANCEL("cancel"),
    CHARGE("charge"),
    REFUND("refund");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ChangeStateAction =
            ChangeStateAction.values().find { it.jsonValue == value }!!
    }
}
