@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property deactivated Returns if a profile is deleted or blocked
 * @property firstName User first name
 * @property hidden Returns if a profile is hidden.
 * @property id User ID
 * @property lastName User last name
 * @property canAccessClosed No description
 * @property isClosed No description
 */
@JsonDeserialize(`as` = UserMinImpl::class)
interface UserMin {
    val deactivated: String?
    val firstName: String
    val hidden: Int?
    val id: Int
    val lastName: String
    val canAccessClosed: Boolean?
    val isClosed: Boolean?
}
