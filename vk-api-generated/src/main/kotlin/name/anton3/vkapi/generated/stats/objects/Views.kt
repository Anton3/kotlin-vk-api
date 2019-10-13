@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

/**
 * Views stats
 *
 * @property age No description
 * @property cities No description
 * @property countries No description
 * @property mobileViews Number of views from mobile devices
 * @property sex No description
 * @property sexAge No description
 * @property views Views number
 * @property visitors Visitors number
 */
data class Views(
    val age: List<SexAge>? = null,
    val cities: List<City>? = null,
    val countries: List<Country>? = null,
    val mobileViews: Int? = null,
    val sex: List<SexAge>? = null,
    val sexAge: List<SexAge>? = null,
    val views: Int? = null,
    val visitors: Int? = null
)
