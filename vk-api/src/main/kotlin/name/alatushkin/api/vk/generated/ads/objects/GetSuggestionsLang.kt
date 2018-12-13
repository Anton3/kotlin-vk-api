package name.alatushkin.api.vk.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetSuggestionsLang(@JsonValue val jsonValue: String) {
    RUSSIAN("ru"),
    UKRAINIAN("ua"),
    ENGLISH("en");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetSuggestionsLang =
            GetSuggestionsLang.values().find { it.jsonValue == value }!!
    }
}
