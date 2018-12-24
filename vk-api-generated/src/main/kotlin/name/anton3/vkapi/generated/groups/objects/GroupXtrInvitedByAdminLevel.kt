package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupXtrInvitedByAdminLevel(@get:JsonValue val value: String) {
    MODERATOR("1"),
    EDITOR("2"),
    ADMINISTRATOR("3")
}
