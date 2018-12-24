package name.anton3.vkapi.generated.search.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class HintSection(@JsonValue override val value: String) : Value<String> {
    GROUPS("groups"),
    EVENTS("events"),
    PUBLICS("publics"),
    CORRESPONDENTS("correspondents"),
    PEOPLE("people"),
    FRIENDS("friends"),
    MUTUAL_FRIENDS("mutual_friends");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): HintSection = parseEnum(value)
    }
}
