@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property age No description
 * @property cities No description
 * @property day Day as YYYY-MM-DD
 * @property month Month as YYYY-MM
 * @property overall 1 if period=overall
 * @property sex No description
 * @property sexAge No description
 */
data class DemostatsFormat(
    val age: List<StatsAge>? = null,
    val cities: List<StatsCities>? = null,
    val day: String? = null,
    val month: String? = null,
    val overall: Int? = null,
    val sex: List<StatsSex>? = null,
    val sexAge: List<StatsSexAge>? = null
)
