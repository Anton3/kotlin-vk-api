package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSort(@JsonValue val jsonValue: String) {
    DURATION("1"),
    RELEVANCE("2"),
    DATE_ADDED("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchSort =
            SearchSort.values().find { it.jsonValue == value }!!
    }
}
