@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property 2faRequired No description
 * @property country Country code
 * @property httpsRequired No description
 * @property intro No description
 * @property lang Language ID
 * @property noWallReplies No description
 * @property ownPostsDefault No description
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
