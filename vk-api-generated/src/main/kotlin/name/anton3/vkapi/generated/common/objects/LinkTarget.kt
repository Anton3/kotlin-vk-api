package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class LinkTarget(@JsonValue override val value: String) : Value<String> {
    INTERNAL("internal"),
    EXTERNAL("external"),
    OTHER("other");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): LinkTarget = parseEnum(value)
    }
}
