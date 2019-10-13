@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

/**
 * Activity stats
 *
 * @property comments Comments number
 * @property copies Reposts number
 * @property hidden Hidden from news count
 * @property likes Likes number
 * @property subscribed New subscribers count
 * @property unsubscribed Unsubscribed count
 */
data class Activity(
    val comments: Int? = null,
    val copies: Int? = null,
    val hidden: Int? = null,
    val likes: Int? = null,
    val subscribed: Int? = null,
    val unsubscribed: Int? = null
)
