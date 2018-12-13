package name.alatushkin.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SearchStatus(@JsonValue val jsonValue: String) {
    NOT_SPECIFIED("0"),
    NOT_MARRIED("1"),
    RELATIONSHIP("2"),
    ENGAGED("3"),
    MARRIED("4"),
    COMPLICATED("5"),
    ACTIVELY_SEARCHING("6"),
    IN_LOVE("7");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchStatus =
            SearchStatus.values().find { it.jsonValue == value }!!
    }
}
