@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id Community ID
 * @property name Community name
 * @property screenName Domain of the community page
 * @property isClosed Information whether community is closed
 * @property type No description
 * @property isAdmin Information whether current user is manager
 * @property adminLevel No description
 * @property isMember Information whether current user is member
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 * @property invitedBy Inviter ID
 */
data class GroupXtrInvitedBy(
    val id: String? = null,
    val name: String? = null,
    val screenName: String? = null,
    val isClosed: BoolInt? = null,
    val type: GroupXtrInvitedByType? = null,
    val isAdmin: BoolInt? = null,
    val adminLevel: GroupXtrInvitedByAdminLevel? = null,
    val isMember: BoolInt? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null,
    val invitedBy: Int? = null
)
