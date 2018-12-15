package name.alatushkin.vkapi.generated.users.objects

/**
 * No description
 *
 * @property albums Albums number
 * @property videos Videos number
 * @property audios Audios number
 * @property notes Notes number
 * @property photos Photos number
 * @property groups Communities number
 * @property gifts Gifts number
 * @property friends Friends number
 * @property onlineFriends Online friends number
 * @property userPhotos Number of photos with user
 * @property userVideos Number of videos with user
 * @property followers Followers number
 * @property subscriptions Subscriptions number
 * @property pages Public pages number
 */
data class UserCounters(
    val albums: Long? = null,
    val videos: Long? = null,
    val audios: Long? = null,
    val notes: Long? = null,
    val photos: Long? = null,
    val groups: Long? = null,
    val gifts: Long? = null,
    val friends: Long? = null,
    val onlineFriends: Long? = null,
    val userPhotos: Long? = null,
    val userVideos: Long? = null,
    val followers: Long? = null,
    val subscriptions: Long? = null,
    val pages: Long? = null
)
