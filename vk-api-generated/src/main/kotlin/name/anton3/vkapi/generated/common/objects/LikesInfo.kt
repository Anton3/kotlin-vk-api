@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Likes number
 * @property userLikes Information whether current uer has liked the post
 * @property canLike No description
 * @property canPublish No description
 */
data class LikesInfo(
    val count: Int? = null,
    val userLikes: Int? = null,
    val canLike: BoolInt? = null,
    val canPublish: BoolInt? = null
)
