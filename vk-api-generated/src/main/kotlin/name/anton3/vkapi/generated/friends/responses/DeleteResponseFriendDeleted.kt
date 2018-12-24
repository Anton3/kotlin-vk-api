package name.anton3.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class DeleteResponseFriendDeleted(@JsonValue override val value: String) : Value<String> {
    OK("1");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): DeleteResponseFriendDeleted = parseEnum(value)
    }
}
