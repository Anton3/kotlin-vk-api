package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetHistoryRev(@JsonValue override val value: String) : Value<String> {
    CHRONOLOGICAL("1"),
    REVERSE_CHRONOLOGICAL("0");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetHistoryRev = parseEnum(value)
    }
}
