package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property cid Comment ID
 * @property uid User ID
 * @property date Date when the comment has been added in Unixtime
 * @property text Comment text
 * @property likes No description
 * @property user No description
 */
data class CommentRepliesItem(
    val cid: Long? = null,
    val uid: Long? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val likes: WidgetLikes? = null,
    val user: UserFull? = null
)
