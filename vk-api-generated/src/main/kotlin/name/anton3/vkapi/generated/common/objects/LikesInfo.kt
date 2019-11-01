@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property canLike Information whether current user can like the post
 * @property canPublish Information whether current user can repost
 * @property count Likes number
 * @property userLikes Information whether current uer has liked the post
 */
data class LikesInfo(
    val canLike: BoolInt? = null,
    val canPublish: BoolInt? = null,
    val count: Int,
    val userLikes: Int
)
