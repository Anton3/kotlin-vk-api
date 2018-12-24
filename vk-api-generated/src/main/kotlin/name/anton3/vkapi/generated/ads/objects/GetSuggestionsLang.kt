package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetSuggestionsLang(@get:JsonValue val value: String) {
    RUSSIAN("ru"),
    UKRAINIAN("ua"),
    ENGLISH("en")
}
