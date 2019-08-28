@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Comments number
 * @property canPost Information whether current user can comment the post
 * @property replies No description
 */
data class CommentReplies(
    val count: Int? = null,
    val canPost: BoolInt? = null,
    val replies: List<CommentRepliesItem>? = null
)
