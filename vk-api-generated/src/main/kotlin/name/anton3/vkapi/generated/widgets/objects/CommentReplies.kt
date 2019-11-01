@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property canPost Information whether current user can comment the post
 * @property count Comments number
 * @property replies No description
 */
data class CommentReplies(
    val canPost: BoolInt? = null,
    val count: Int? = null,
    val replies: List<CommentRepliesItem>? = null
)
