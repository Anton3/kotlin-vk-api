package name.anton3.vkapi.generated.stats.objects

/**
 * No description
 *
 * @property periodFrom Day (YYYY-MM-DD)
 * @property periodTo Day (YYYY-MM-DD)
 * @property visitors No description
 * @property reach No description
 * @property activity No description
 */
data class Period(
    val periodFrom: String? = null,
    val periodTo: String? = null,
    val visitors: Views? = null,
    val reach: Reach? = null,
    val activity: Activity? = null
)
