package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Comments number
 * @property canPost Information whether current user can comment the post
 * @property groupsCanPost Information whether groups can comment the post
 */
data class CommentsInfo(
    val count: Int? = null,
    val canPost: BoolInt? = null,
    val groupsCanPost: BoolInt? = null
)
