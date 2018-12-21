package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSort(@JsonValue val jsonValue: String) {
    BY_RATING("0"),
    BY_DATE_REGISTERED("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchSort =
            SearchSort.values().find { it.jsonValue == value }!!
    }
}
