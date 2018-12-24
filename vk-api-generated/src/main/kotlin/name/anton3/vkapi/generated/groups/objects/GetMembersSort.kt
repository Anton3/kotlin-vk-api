package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetMembersSort(@JsonValue override val value: String) : Value<String> {
    ID_ASC("id_asc"),
    ID_DESC("id_desc"),
    TIME_ASC("time_asc"),
    TIME_DESC("time_desc");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetMembersSort = parseEnum(value)
    }
}
