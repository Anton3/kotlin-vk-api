package name.anton3.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AddResponse(@JsonValue override val value: String) : Value<String> {
    SEND("1"),
    APPROVED("2"),
    RESEND("4");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): AddResponse = parseEnum(value)
    }
}
