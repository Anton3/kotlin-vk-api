package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SearchSex(@JsonValue override val value: String) : Value<String> {
    ANY("0"),
    FEMALE("1"),
    MALE("2");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): SearchSex = parseEnum(value)
    }
}
