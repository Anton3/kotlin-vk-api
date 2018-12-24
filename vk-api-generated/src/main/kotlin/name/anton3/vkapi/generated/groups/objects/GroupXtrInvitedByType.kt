package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupXtrInvitedByType(@get:JsonValue val value: String) {
    GROUP("group"),
    PAGE("page"),
    EVENT("event")
}
