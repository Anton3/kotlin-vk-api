@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

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
    val httpsRequired: BoolInt? = null,
    val ownPostsDefault: BoolInt? = null,
    val noWallReplies: BoolInt? = null,
    val intro: BoolInt? = null,
    val lang: Int? = null,
    val `2faRequired`: BoolInt? = null
)
