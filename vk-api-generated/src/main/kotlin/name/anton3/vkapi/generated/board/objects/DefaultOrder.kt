package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class DefaultOrder(@JsonValue override val value: Int) : Value<Int> {
    DESC_UPDATED(1),
    DESC_CREATED(2),
    ASC_UPDATED(-1),
    ASC_CREATED(-2);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): DefaultOrder = parseEnum(value)
    }
}
