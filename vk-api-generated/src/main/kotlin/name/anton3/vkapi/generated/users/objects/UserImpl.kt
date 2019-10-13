@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.generated.friends.objects.FriendStatusStatus
import name.anton3.vkapi.generated.friends.objects.RequestsMutual
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property sex No description
 * @property screenName Domain name of the user's page
 * @property photo50 URL of square photo of the user with 50 pixels in width
 * @property photo100 URL of square photo of the user with 100 pixels in width
 * @property online No description
 * @property onlineMobile No description
 * @property onlineApp Application ID
 * @property verified No description
 * @property trending No description
 * @property friendStatus No description
 * @property mutual No description
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property isClosed No description
 * @property canAccessClosed No description
 */
@JsonDeserialize(`as` = Void::class)
data class UserImpl(
    override val sex: Sex? = null,
    override val screenName: String? = null,
    @get:JsonProperty("photo_50") override val photo50: String? = null,
    @get:JsonProperty("photo_100") override val photo100: String? = null,
    override val online: BoolInt? = null,
    override val onlineMobile: BoolInt? = null,
    override val onlineApp: Int? = null,
    override val verified: BoolInt? = null,
    override val trending: BoolInt? = null,
    override val friendStatus: FriendStatusStatus? = null,
    override val mutual: RequestsMutual? = null,
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: UserMinDeactivated? = null,
    override val isClosed: BoolInt,
    override val canAccessClosed: BoolInt? = null
) : User
