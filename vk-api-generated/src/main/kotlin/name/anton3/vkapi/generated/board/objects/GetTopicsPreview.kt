package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetTopicsPreview(@JsonValue override val value: Int) : Value<Int> {
    FIRST(1),
    LAST(2),
    NONE(0);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GetTopicsPreview = parseEnum(value)
    }
}
