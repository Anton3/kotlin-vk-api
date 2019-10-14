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
 * @property deactivated Returns if a profile is deleted or blocked
 * @property firstName User first name
 * @property hidden Returns if a profile is hidden.
 * @property id User ID
 * @property lastName User last name
 * @property canAccessClosed No description
 * @property isClosed No description
 */
@JsonDeserialize(`as` = UserImpl::class)
interface User : UserMin {
    val sex: Sex?
    val screenName: String?
    @get:JsonProperty("photo_50") val photo50: String?
    @get:JsonProperty("photo_100") val photo100: String?
    val online: BoolInt?
    val onlineMobile: BoolInt?
    val onlineApp: Int?
    val verified: BoolInt?
    val trending: BoolInt?
    val friendStatus: FriendStatusStatus?
    val mutual: RequestsMutual?
    override val deactivated: String?
    override val firstName: String
    override val hidden: Int?
    override val id: Int
    override val lastName: String
    override val canAccessClosed: Boolean?
    override val isClosed: Boolean?
}
