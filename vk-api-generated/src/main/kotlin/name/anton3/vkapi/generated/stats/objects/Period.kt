@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

/**
 * No description
 *
 * @property activity No description
 * @property periodFrom Unix timestamp
 * @property periodTo Unix timestamp
 * @property reach No description
 * @property visitors No description
 */
data class Period(
    val activity: Activity? = null,
    val periodFrom: Int? = null,
    val periodTo: Int? = null,
    val reach: Reach? = null,
    val visitors: Views? = null
)
