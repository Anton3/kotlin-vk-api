package name.alatushkin.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetMembersSort(@JsonValue val jsonValue: String) {
    ID_ASC("id_asc"),
    ID_DESC("id_desc"),
    TIME_ASC("time_asc"),
    TIME_DESC("time_desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetMembersSort =
            GetMembersSort.values().find { it.jsonValue == value }!!
    }
}
