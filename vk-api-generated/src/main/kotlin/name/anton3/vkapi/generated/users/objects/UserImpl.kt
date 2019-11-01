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
 * @property sex User sex
 * @property screenName Domain name of the user's page
 * @property photo50 URL of square photo of the user with 50 pixels in width
 * @property photo100 URL of square photo of the user with 100 pixels in width
 * @property online Information whether the user is online
 * @property onlineMobile Information whether the user is online in mobile site or application
 * @property onlineApp Application ID
 * @property verified Information whether the user is verified
 * @property trending Information whether the user has a "fire" pictogram.
 * @property friendStatus No description
 * @property mutual No description
 * @property deactivated Returns if a profile is deleted or blocked
 * @property firstName User first name
 * @property hidden Returns if a profile is hidden.
 * @property id User ID
 * @property lastName User last name
 * @property canAccessClosed No description
 * @property isClosed No description
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
    override val deactivated: String? = null,
    override val firstName: String,
    override val hidden: Int? = null,
    override val id: Int,
    override val lastName: String,
    override val canAccessClosed: Boolean? = null,
    override val isClosed: Boolean? = null
) : User
