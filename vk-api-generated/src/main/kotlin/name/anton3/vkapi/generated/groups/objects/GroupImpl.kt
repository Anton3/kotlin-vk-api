package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

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
@JsonDeserialize(`as` = Void::class)
data class GroupImpl(
    override val id: Int? = null,
    override val name: String? = null,
    override val screenName: String? = null,
    override val deactivated: String? = null,
    override val isClosed: Visibility? = null,
    override val type: Type? = null,
    override val isAdmin: Boolean? = null,
    override val adminLevel: GroupAdminLevel? = null,
    override val isMember: Boolean? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val photo200: String? = null
) : Group
