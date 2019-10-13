@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property cities No description
 * @property countries No description
 * @property sexAge No description
 * @property timestamp Start time
 * @property views Total views number
 */
data class StatsExtended(
    val cities: List<StatsCity>? = null,
    val countries: List<StatsCountry>? = null,
    val sexAge: List<StatsSexAge>? = null,
    val timestamp: VkDate? = null,
    val views: Int? = null
)
