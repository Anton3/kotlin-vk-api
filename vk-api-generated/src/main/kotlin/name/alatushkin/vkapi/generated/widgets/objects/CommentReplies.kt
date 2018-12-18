package name.anton3.vkapi.generated.widgets.objects

/**
 * No description
 *
 * @property count Comments number
 * @property canPost Information whether current user can comment the post
 * @property replies No description
 */
data class CommentReplies(
    val count: Long? = null,
    val canPost: Boolean? = null,
    val replies: List<CommentRepliesItem>? = null
)
