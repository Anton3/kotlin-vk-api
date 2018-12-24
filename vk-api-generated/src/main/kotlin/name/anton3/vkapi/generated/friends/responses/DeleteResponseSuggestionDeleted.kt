package name.anton3.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class DeleteResponseSuggestionDeleted(@JsonValue override val value: String) : Value<String> {
    OK("1");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): DeleteResponseSuggestionDeleted = parseEnum(value)
    }
}
