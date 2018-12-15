package name.alatushkin.vkapi.generated.stats.objects

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
    val likes: Long? = null,
    val comments: Long? = null,
    val copies: Long? = null,
    val subscribed: Long? = null,
    val unsubscribed: Long? = null,
    val hidden: Long? = null
)
