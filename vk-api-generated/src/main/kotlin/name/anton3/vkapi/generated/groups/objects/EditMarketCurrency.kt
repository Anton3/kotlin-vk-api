package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class EditMarketCurrency(@JsonValue override val value: String) : Value<String> {
    RUSSIAN_RUBLES("643"),
    UKRAINIAN_HRYVNIA("980"),
    KAZAKH_TENGE("398"),
    EURO("978"),
    US_DOLLARS("840");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): EditMarketCurrency = parseEnum(value)
    }
}
