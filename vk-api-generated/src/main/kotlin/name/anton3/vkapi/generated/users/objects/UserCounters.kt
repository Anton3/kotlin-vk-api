package name.anton3.vkapi.generated.users.objects

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
    val albums: Int? = null,
    val videos: Int? = null,
    val audios: Int? = null,
    val notes: Int? = null,
    val photos: Int? = null,
    val groups: Int? = null,
    val gifts: Int? = null,
    val friends: Int? = null,
    val onlineFriends: Int? = null,
    val userPhotos: Int? = null,
    val userVideos: Int? = null,
    val followers: Int? = null,
    val subscriptions: Int? = null,
    val pages: Int? = null
)
