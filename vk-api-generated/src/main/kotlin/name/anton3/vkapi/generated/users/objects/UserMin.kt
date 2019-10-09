@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property isClosed Is the profile hidden by privacy settings
 * @property canAccessClosed Can we see the profile if is_closed = 1 (e.g. if that user is our friend)
 */
@JsonDeserialize(`as` = UserMinImpl::class)
interface UserMin {
    val id: Int
    val firstName: String
    val lastName: String
    val deactivated: UserMinDeactivated?
    val isClosed: BoolInt
    val canAccessClosed: BoolInt?
}
