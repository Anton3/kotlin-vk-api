package name.anton3.vkapi.generated.leads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CheckedResult(@JsonValue override val value: String) : Value<String> {
    TRUE("true"),
    FALSE("false");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CheckedResult = parseEnum(value)
    }
}
