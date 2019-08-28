@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCatalogSort(override val value: String) : ValueEnum<String> {
    POPULAR_TODAY("popular_today"),
    VISITORS("visitors"),
    CREATE_DATE("create_date"),
    GROWTH_RATE("growth_rate"),
    POPULAR_WEEK("popular_week")
}
