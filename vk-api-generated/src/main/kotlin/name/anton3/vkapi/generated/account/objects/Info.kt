@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property 2faRequired Two factor authentication is enabled
 * @property country Country code
 * @property httpsRequired Information whether HTTPS-only is enabled
 * @property intro Information whether user has been processed intro
 * @property lang Language ID
 * @property noWallReplies Information whether wall comments should be hidden
 * @property ownPostsDefault Information whether only owners posts should be shown
 */
data class Info(
    val `2faRequired`: BoolInt? = null,
    val country: String? = null,
    val httpsRequired: BoolInt? = null,
    val intro: BoolInt? = null,
    val lang: Int? = null,
    val noWallReplies: BoolInt? = null,
    val ownPostsDefault: BoolInt? = null
)
