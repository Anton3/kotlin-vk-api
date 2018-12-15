package name.alatushkin.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property day Day as YYYY-MM-DD
 * @property month Month as YYYY-MM
 * @property overall 1 if period=overall
 * @property spent Spent funds
 * @property impressions Impressions number
 * @property clicks Clicks number
 * @property reach Reach
 * @property videoViews Video views number
 * @property videoViewsHalf Video views (half of video)
 * @property videoViewsFull Video views (full video)
 * @property videoClicksSite Clickthoughs to the advertised site
 * @property joinRate Events number
 */
data class StatsFormat(
    val day: String? = null,
    val month: String? = null,
    val overall: Long? = null,
    val spent: Long? = null,
    val impressions: Long? = null,
    val clicks: Long? = null,
    val reach: Long? = null,
    val videoViews: Long? = null,
    val videoViewsHalf: Long? = null,
    val videoViewsFull: Long? = null,
    val videoClicksSite: Long? = null,
    val joinRate: Long? = null
)
