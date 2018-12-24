package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GroupAdminLevel(@JsonValue override val value: String) : Value<String> {
    MODERATOR("1"),
    EDITOR("2"),
    ADMINISTRATOR("3");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GroupAdminLevel = parseEnum(value)
    }
}
