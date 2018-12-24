package name.anton3.vkapi.generated.pages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class Access(@JsonValue override val value: String) : Value<String> {
    MANAGERS("0"),
    MEMBERS("1"),
    ALL("2");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): Access = parseEnum(value)
    }
}
