package name.anton3.vkapi.generated.search.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class HintType(@JsonValue override val value: String) : Value<String> {
    GROUP("group"),
    PROFILE("profile");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): HintType = parseEnum(value)
    }
}
