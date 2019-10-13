@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property canPost Information whether current user can comment the post
 * @property groupsCanPost Information whether groups can comment the post
 * @property currentLevelCount Count of replies of current level
 */
data class GetCommentsResponse(
    val count: Int,
    val items: List<WallComment>,
    val canPost: Boolean? = null,
    val groupsCanPost: Boolean? = null,
    val currentLevelCount: Int? = null
)
