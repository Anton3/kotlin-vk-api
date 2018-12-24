package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class OwnerXtrBanInfoType(@JsonValue override val value: String) : Value<String> {
    GROUP("group"),
    PROFILE("profile");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): OwnerXtrBanInfoType = parseEnum(value)
    }
}
