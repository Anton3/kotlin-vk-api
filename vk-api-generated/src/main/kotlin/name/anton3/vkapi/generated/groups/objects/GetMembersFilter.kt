package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetMembersFilter(@get:JsonValue val value: String) {
    FRIENDS("friends"),
    UNSURE("unsure")
}
