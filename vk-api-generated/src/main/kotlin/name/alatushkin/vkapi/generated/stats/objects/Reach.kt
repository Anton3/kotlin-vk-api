package name.anton3.vkapi.generated.stats.objects

/**
 * Reach stats
 *
 * @property reach Reach count
 * @property reachSubscribers Subscribers reach count
 * @property mobileReach Reach count from mobile devices
 * @property sex No description
 * @property age No description
 * @property sexAge No description
 * @property countries No description
 * @property cities No description
 */
data class Reach(
    val reach: Long? = null,
    val reachSubscribers: Long? = null,
    val mobileReach: Long? = null,
    val sex: List<SexAge>? = null,
    val age: List<SexAge>? = null,
    val sexAge: List<SexAge>? = null,
    val countries: List<Country>? = null,
    val cities: List<City>? = null
)
