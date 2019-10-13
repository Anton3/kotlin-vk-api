@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.comment.objects

import name.anton3.vkapi.generated.wall.objects.WallComment

/**
 * No description
 *
 * @property canPost Information whether current user can comment the post
 * @property count Comments number
 * @property groupsCanPost Information whether groups can comment the post
 * @property items No description
 * @property showReplyButton Information whether recommended to display reply button
 */
data class Thread(
    val canPost: Boolean? = null,
    val count: Int,
    val groupsCanPost: Boolean? = null,
    val items: List<WallComment>? = null,
    val showReplyButton: Boolean? = null
)
