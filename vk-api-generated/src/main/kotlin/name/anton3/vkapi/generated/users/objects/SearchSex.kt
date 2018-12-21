package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSex(@JsonValue val jsonValue: String) {
    ANY("0"),
    FEMALE("1"),
    MALE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchSex =
            SearchSex.values().find { it.jsonValue == value }!!
    }
}
