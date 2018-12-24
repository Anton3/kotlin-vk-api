package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetSuggestionsLang(@JsonValue override val value: String) : Value<String> {
    RUSSIAN("ru"),
    UKRAINIAN("ua"),
    ENGLISH("en");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetSuggestionsLang = parseEnum(value)
    }
}
