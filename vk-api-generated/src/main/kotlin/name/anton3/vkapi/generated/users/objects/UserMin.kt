package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property hidden Returns if a profile is hidden.
 */
@JsonDeserialize(`as` = UserMinImpl::class)
interface UserMin {
    val id: Long
    val firstName: String
    val lastName: String
    val deactivated: String?
    val hidden: Long?
}
