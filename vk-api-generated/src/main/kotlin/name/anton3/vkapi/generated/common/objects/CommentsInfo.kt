package name.anton3.vkapi.generated.common.objects

/**
 * No description
 *
 * @property count Comments number
 * @property canPost Information whether current user can comment the post
 * @property groupsCanPost Information whether groups can comment the post
 */
data class CommentsInfo(
    val count: Int? = null,
    val canPost: Boolean? = null,
    val groupsCanPost: Boolean? = null
)
