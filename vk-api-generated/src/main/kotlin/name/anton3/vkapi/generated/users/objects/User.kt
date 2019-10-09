@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Sex
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
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property isClosed Is the profile hidden by privacy settings
 * @property canAccessClosed Can we see the profile if is_closed = 1 (e.g. if that user is our friend)
 */
@JsonDeserialize(`as` = UserImpl::class)
interface User : UserMin {
    val sex: Sex?
    val screenName: String?
    val photo50: String?
    val photo100: String?
    val online: BoolInt?
    val onlineMobile: BoolInt?
    val onlineApp: Int?
    override val id: Int
    override val firstName: String
    override val lastName: String
    override val deactivated: UserMinDeactivated?
    override val isClosed: BoolInt
    override val canAccessClosed: BoolInt?
}
