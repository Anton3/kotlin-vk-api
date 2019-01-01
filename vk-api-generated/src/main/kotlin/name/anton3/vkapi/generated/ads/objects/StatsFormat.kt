package name.anton3.vkapi.generated.ads.objects

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
    val overall: Int? = null,
    val spent: Int? = null,
    val impressions: Int? = null,
    val clicks: Int? = null,
    val reach: Int? = null,
    val videoViews: Int? = null,
    val videoViewsHalf: Int? = null,
    val videoViewsFull: Int? = null,
    val videoClicksSite: Int? = null,
    val joinRate: Int? = null
)
