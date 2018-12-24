package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class UserType(@JsonValue override val value: String) : Value<String> {
    PROFILE("profile");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): UserType = parseEnum(value)
    }
}
