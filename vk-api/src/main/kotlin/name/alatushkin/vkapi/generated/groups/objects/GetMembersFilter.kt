package name.alatushkin.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetMembersFilter(@JsonValue val jsonValue: String) {
    FRIENDS("friends"),
    UNSURE("unsure");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetMembersFilter =
            GetMembersFilter.values().find { it.jsonValue == value }!!
    }
}
