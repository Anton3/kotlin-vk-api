@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property canLike No description
 * @property canPublish No description
 * @property count Likes number
 * @property userLikes Information whether current uer has liked the post
 */
data class LikesInfo(
    val canLike: BoolInt? = null,
    val canPublish: BoolInt? = null,
    val count: Int,
    val userLikes: Int
)
