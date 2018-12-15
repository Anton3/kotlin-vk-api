package name.alatushkin.vkapi.generated.groups.objects

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
    val isClosed: Boolean? = null,
    val type: GroupXtrInvitedByType? = null,
    val isAdmin: Boolean? = null,
    val adminLevel: GroupXtrInvitedByAdminLevel? = null,
    val isMember: Boolean? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null,
    val invitedBy: Long? = null
)
