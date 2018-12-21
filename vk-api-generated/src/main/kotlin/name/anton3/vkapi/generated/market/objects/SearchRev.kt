package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SearchRev(@JsonValue val jsonValue: String) {
    NORMAL("0"),
    REVERSE("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchRev =
            SearchRev.values().find { it.jsonValue == value }!!
    }
}
