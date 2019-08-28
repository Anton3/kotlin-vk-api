@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id Community ID
 * @property name Community name
 * @property screenName Domain of the community page
 * @property deactivated Information whether community is banned
 * @property isClosed No description
 * @property type No description
 * @property isAdmin Information whether current user is administrator
 * @property adminLevel No description
 * @property isMember Information whether current user is member
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 */
@JsonDeserialize(`as` = GroupImpl::class)
interface Group {
    val id: Int?
    val name: String?
    val screenName: String?
    val deactivated: String?
    val isClosed: Visibility?
    val type: Type?
    val isAdmin: BoolInt?
    val adminLevel: GroupAdminLevel?
    val isMember: BoolInt?
    val photo50: String?
    val photo100: String?
    val photo200: String?
}
