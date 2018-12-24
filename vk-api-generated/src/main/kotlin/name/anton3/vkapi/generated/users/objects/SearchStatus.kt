package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchStatus(@JsonValue override val value: String) : Value<String> {
    NOT_SPECIFIED("0"),
    NOT_MARRIED("1"),
    RELATIONSHIP("2"),
    ENGAGED("3"),
    MARRIED("4"),
    COMPLICATED("5"),
    ACTIVELY_SEARCHING("6"),
    IN_LOVE("7");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): SearchStatus = parseEnum(value)
    }
}
