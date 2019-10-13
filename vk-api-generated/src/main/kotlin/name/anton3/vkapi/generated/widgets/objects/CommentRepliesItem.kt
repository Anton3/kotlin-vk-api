@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property cid Comment ID
 * @property date Date when the comment has been added in Unixtime
 * @property likes No description
 * @property text Comment text
 * @property uid User ID
 * @property user No description
 */
data class CommentRepliesItem(
    val cid: Int? = null,
    val date: VkDate? = null,
    val likes: WidgetLikes? = null,
    val text: String? = null,
    val uid: Int? = null,
    val user: UserFull? = null
)
