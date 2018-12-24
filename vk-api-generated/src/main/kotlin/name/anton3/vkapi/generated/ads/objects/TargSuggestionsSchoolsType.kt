package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class TargSuggestionsSchoolsType(@JsonValue override val value: String) : Value<String> {
    SCHOOL("school"),
    UNIVERSITY("university"),
    FACULTY("faculty"),
    CHAIR("chair");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): TargSuggestionsSchoolsType = parseEnum(value)
    }
}
