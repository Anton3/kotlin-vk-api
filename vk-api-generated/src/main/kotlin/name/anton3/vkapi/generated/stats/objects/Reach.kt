@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

/**
 * Reach stats
 *
 * @property age No description
 * @property cities No description
 * @property countries No description
 * @property mobileReach Reach count from mobile devices
 * @property reach Reach count
 * @property reachSubscribers Subscribers reach count
 * @property sex No description
 * @property sexAge No description
 */
data class Reach(
    val age: List<SexAge>? = null,
    val cities: List<City>? = null,
    val countries: List<Country>? = null,
    val mobileReach: Int? = null,
    val reach: Int? = null,
    val reachSubscribers: Int? = null,
    val sex: List<SexAge>? = null,
    val sexAge: List<SexAge>? = null
)
