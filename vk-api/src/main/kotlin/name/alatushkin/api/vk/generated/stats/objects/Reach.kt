package name.alatushkin.api.vk.generated.stats.objects

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
