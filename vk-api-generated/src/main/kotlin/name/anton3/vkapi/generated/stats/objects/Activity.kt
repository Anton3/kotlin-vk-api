package name.anton3.vkapi.generated.stats.objects

/**
 * Activity stats
 *
 * @property likes Likes number
 * @property comments Comments number
 * @property copies Reposts number
 * @property subscribed New subscribers count
 * @property unsubscribed Unsubscribed count
 * @property hidden Hidden from news count
 */
data class Activity(
    val likes: Int? = null,
    val comments: Int? = null,
    val copies: Int? = null,
    val subscribed: Int? = null,
    val unsubscribed: Int? = null,
    val hidden: Int? = null
)
