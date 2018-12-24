package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetTopicsOrder(@JsonValue override val value: String) : Value<String> {
    UPDATED_DESC("1"),
    CREATED_DESC("2"),
    UPDATED_ASC("-1"),
    CREATED_ASC("-2"),
    AS_BY_ADMINISTRATOR("0");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetTopicsOrder = parseEnum(value)
    }
}
