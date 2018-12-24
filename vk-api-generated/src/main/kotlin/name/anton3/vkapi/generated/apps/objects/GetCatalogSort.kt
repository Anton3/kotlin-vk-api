package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCatalogSort(@get:JsonValue val value: String) {
    POPULAR_TODAY("popular_today"),
    VISITORS("visitors"),
    CREATE_DATE("create_date"),
    GROWTH_RATE("growth_rate"),
    POPULAR_WEEK("popular_week")
}
