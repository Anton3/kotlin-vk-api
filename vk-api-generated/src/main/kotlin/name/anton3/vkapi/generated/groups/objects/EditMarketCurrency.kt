package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class EditMarketCurrency(@get:JsonValue val value: String) {
    RUSSIAN_RUBLES("643"),
    UKRAINIAN_HRYVNIA("980"),
    KAZAKH_TENGE("398"),
    EURO("978"),
    US_DOLLARS("840")
}
