package name.alatushkin.api.vk.generated.stats.objects

data class Views(
    val views: Long? = null,
    val visitors: Long? = null,
    val mobileViews: Long? = null,
    val sex: List<SexAge>? = null,
    val age: List<SexAge>? = null,
    val sexAge: List<SexAge>? = null,
    val countries: List<Country>? = null,
    val cities: List<City>? = null
)
