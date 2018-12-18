package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property country Country code
 * @property httpsRequired Information whether HTTPS-only is enabled
 * @property ownPostsDefault Information whether only owners posts should be shown
 * @property noWallReplies Information whether wall comments should be hidden
 * @property intro Information whether user has been processed intro
 * @property lang Language ID
 * @property 2faRequired Two factor authentication is enabled
 */
data class Info(
    val country: String? = null,
    val httpsRequired: Boolean? = null,
    val ownPostsDefault: Boolean? = null,
    val noWallReplies: Boolean? = null,
    val intro: Boolean? = null,
    val lang: Long? = null,
    val `2faRequired`: Boolean? = null
)
