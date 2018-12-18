package name.anton3.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class DeleteResponseSuggestionDeleted(@JsonValue val jsonValue: String) {
    OK("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DeleteResponseSuggestionDeleted =
            DeleteResponseSuggestionDeleted.values().find { it.jsonValue == value }!!
    }
}
