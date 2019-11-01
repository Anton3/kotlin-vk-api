@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property canPost Information whether current user can comment the post
 * @property count Comments number
 * @property groupsCanPost Information whether groups can comment the post
 */
data class CommentsInfo(
    val canPost: BoolInt? = null,
    val count: Int? = null,
    val groupsCanPost: Boolean? = null
)
