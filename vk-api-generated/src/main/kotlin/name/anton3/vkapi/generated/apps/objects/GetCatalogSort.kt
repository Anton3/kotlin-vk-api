package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetCatalogSort(@JsonValue override val value: String) : Value<String> {
    POPULAR_TODAY("popular_today"),
    VISITORS("visitors"),
    CREATE_DATE("create_date"),
    GROWTH_RATE("growth_rate"),
    POPULAR_WEEK("popular_week");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetCatalogSort = parseEnum(value)
    }
}
