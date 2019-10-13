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
 * @property isAdmin No description
 * @property isAdvertiser No description
 * @property isClosed No description
 * @property isMember No description
 * @property name Community name
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property screenName Domain of the community page
 * @property startDate Start date in Unixtime format
 * @property type No description
 */
@JsonDeserialize(`as` = Void::class)
data class GroupImpl(
    override val adminLevel: GroupAdminLevel? = null,
    override val deactivated: String? = null,
    override val finishDate: Int? = null,
    override val id: Int? = null,
    override val isAdmin: BoolInt? = null,
    override val isAdvertiser: BoolInt? = null,
    override val isClosed: GroupIsClosed? = null,
    override val isMember: BoolInt? = null,
    override val name: String? = null,
    @get:JsonProperty("photo_100") override val photo100: String? = null,
    @get:JsonProperty("photo_200") override val photo200: String? = null,
    @get:JsonProperty("photo_50") override val photo50: String? = null,
    override val screenName: String? = null,
    override val startDate: Int? = null,
    override val type: Type? = null
) : Group
