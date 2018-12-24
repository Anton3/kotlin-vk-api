package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CatBlockView(@JsonValue override val value: String) : Value<String> {
    HORIZONTAL("horizontal"),
    HORIZONTAL_COMPACT("horizontal_compact"),
    VERTICAL("vertical"),
    VERTICAL_COMPACT("vertical_compact");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): CatBlockView = parseEnum(value)
    }
}
