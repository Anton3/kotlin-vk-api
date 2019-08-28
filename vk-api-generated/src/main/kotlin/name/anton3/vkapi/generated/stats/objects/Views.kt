@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

/**
 * Views stats
 *
 * @property views Views number
 * @property visitors Visitors number
 * @property mobileViews Number of views from mobile devices
 * @property sex No description
 * @property age No description
 * @property sexAge No description
 * @property countries No description
 * @property cities No description
 */
data class Views(
    val views: Int? = null,
    val visitors: Int? = null,
    val mobileViews: Int? = null,
    val sex: List<SexAge>? = null,
    val age: List<SexAge>? = null,
    val sexAge: List<SexAge>? = null,
    val countries: List<Country>? = null,
    val cities: List<City>? = null
)
