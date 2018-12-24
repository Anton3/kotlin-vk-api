package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetMembersSort(@get:JsonValue val value: String) {
    ID_ASC("id_asc"),
    ID_DESC("id_desc"),
    TIME_ASC("time_asc"),
    TIME_DESC("time_desc")
}
