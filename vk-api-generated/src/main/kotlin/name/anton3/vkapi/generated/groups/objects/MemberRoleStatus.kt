package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class MemberRoleStatus(@get:JsonValue val value: String) {
    MODERATOR("moderator"),
    EDITOR("editor"),
    ADMINISTRATOR("administrator"),
    CREATOR("creator")
}
