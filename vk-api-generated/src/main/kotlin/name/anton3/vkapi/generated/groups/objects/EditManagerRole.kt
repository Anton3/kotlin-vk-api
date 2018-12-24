package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class EditManagerRole(@JsonValue override val value: String) : Value<String> {
    MODERATOR("moderator"),
    EDITOR("editor"),
    ADMINISTRATOR("administrator");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): EditManagerRole = parseEnum(value)
    }
}
