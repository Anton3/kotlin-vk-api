package name.anton3.vkapi.generated.orders.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class ChangeStateAction(@JsonValue override val value: String) : Value<String> {
    CANCEL("cancel"),
    CHARGE("charge"),
    REFUND("refund");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): ChangeStateAction = parseEnum(value)
    }
}
