@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property timestamp Start time
 * @property views Total views number
 * @property sexAge No description
 * @property countries No description
 * @property cities No description
 */
data class StatsExtended(
    val timestamp: VkDate? = null,
    val views: Int? = null,
    val sexAge: List<StatsSexAge>? = null,
    val countries: List<StatsCountry>? = null,
    val cities: List<StatsCity>? = null
)
