@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property adminLevel No description
 * @property deactivated Information whether community is banned
 * @property finishDate Finish date in Unixtime format
 * @property id Community ID
 * @property isAdmin Information whether current user is administrator
 * @property isAdvertiser Information whether current user is advertiser
 * @property isClosed No description
 * @property isMember Information whether current user is member
 * @property name Community name
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property screenName Domain of the community page
 * @property startDate Start date in Unixtime format
 * @property type No description
 */
@JsonDeserialize(`as` = GroupImpl::class)
interface Group {
    val adminLevel: GroupAdminLevel?
    val deactivated: String?
    val finishDate: Int?
    val id: Int?
    val isAdmin: BoolInt?
    val isAdvertiser: BoolInt?
    val isClosed: GroupIsClosed?
    val isMember: BoolInt?
    val name: String?
    @get:JsonProperty("photo_100") val photo100: String?
    @get:JsonProperty("photo_200") val photo200: String?
    @get:JsonProperty("photo_50") val photo50: String?
    val screenName: String?
    val startDate: Int?
    val type: Type?
}
