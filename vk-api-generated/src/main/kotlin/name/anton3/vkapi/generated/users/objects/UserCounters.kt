@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property albums Albums number
 * @property audios Audios number
 * @property followers Followers number
 * @property friends Friends number
 * @property gifts Gifts number
 * @property groups Communities number
 * @property notes Notes number
 * @property onlineFriends Online friends number
 * @property pages Public pages number
 * @property photos Photos number
 * @property subscriptions Subscriptions number
 * @property userPhotos Number of photos with user
 * @property userVideos Number of videos with user
 * @property videos Videos number
 */
data class UserCounters(
    val albums: Int? = null,
    val audios: Int? = null,
    val followers: Int? = null,
    val friends: Int? = null,
    val gifts: Int? = null,
    val groups: Int? = null,
    val notes: Int? = null,
    val onlineFriends: Int? = null,
    val pages: Int? = null,
    val photos: Int? = null,
    val subscriptions: Int? = null,
    val userPhotos: Int? = null,
    val userVideos: Int? = null,
    val videos: Int? = null
)
