@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property showReplyButton No description
 * @property canPost Information whether current user can comment the post
 * @property groupsCanPost Information whether groups can comment the post
 * @property currentLevelCount Count of replies of current level
 * @property profiles No description
 * @property groups No description
 */
data class GetCommentsExtendedResponse(
    val count: Int,
    val items: List<WallComment>,
    val showReplyButton: Boolean? = null,
    val canPost: Boolean? = null,
    val groupsCanPost: Boolean? = null,
    val currentLevelCount: Int? = null,
    val profiles: List<User>,
    val groups: List<Group>
)
