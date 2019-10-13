@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property clicks Clicks number
 * @property day Day as YYYY-MM-DD
 * @property impressions Impressions number
 * @property joinRate Events number
 * @property month Month as YYYY-MM
 * @property overall 1 if period=overall
 * @property reach Reach
 * @property spent Spent funds
 * @property videoClicksSite Clickthoughs to the advertised site
 * @property videoViews Video views number
 * @property videoViewsFull Video views (full video)
 * @property videoViewsHalf Video views (half of video)
 */
data class StatsFormat(
    val clicks: Int? = null,
    val day: String? = null,
    val impressions: Int? = null,
    val joinRate: Int? = null,
    val month: String? = null,
    val overall: Int? = null,
    val reach: Int? = null,
    val spent: Int? = null,
    val videoClicksSite: Int? = null,
    val videoViews: Int? = null,
    val videoViewsFull: Int? = null,
    val videoViewsHalf: Int? = null
)
