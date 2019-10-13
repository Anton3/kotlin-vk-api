@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property adminLevel No description
 * @property id Community ID
 * @property invitedBy Inviter ID
 * @property isAdmin No description
 * @property isAdvertiser No description
 * @property isClosed No description
 * @property isMember No description
 * @property name Community name
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property screenName Domain of the community page
 * @property type No description
 */
data class GroupXtrInvitedBy(
    val adminLevel: GroupXtrInvitedByAdminLevel? = null,
    val id: String? = null,
    val invitedBy: Int? = null,
    val isAdmin: BoolInt? = null,
    val isAdvertiser: BoolInt? = null,
    val isClosed: BoolInt? = null,
    val isMember: BoolInt? = null,
    val name: String? = null,
    @get:JsonProperty("photo_100") val photo100: String? = null,
    @get:JsonProperty("photo_200") val photo200: String? = null,
    @get:JsonProperty("photo_50") val photo50: String? = null,
    val screenName: String? = null,
    val type: GroupXtrInvitedByType? = null
)
