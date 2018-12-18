package name.anton3.vkapi.generated.common.objects

/**
 * No description
 *
 * @property count Likes number
 * @property userLikes Information whether current uer has liked the post
 * @property canLike Information whether current user can like the post
 * @property canPublish Information whether current user can repost
 */
data class LikesInfo(
    val count: Long,
    val userLikes: Long,
    val canLike: Boolean,
    val canPublish: Boolean? = null
)
