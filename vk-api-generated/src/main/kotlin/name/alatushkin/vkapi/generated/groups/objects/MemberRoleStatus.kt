package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class MemberRoleStatus(@JsonValue val jsonValue: String) {
    MODERATOR("moderator"),
    EDITOR("editor"),
    ADMINISTRATOR("administrator"),
    CREATOR("creator");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): MemberRoleStatus =
            MemberRoleStatus.values().find { it.jsonValue == value }!!
    }
}
