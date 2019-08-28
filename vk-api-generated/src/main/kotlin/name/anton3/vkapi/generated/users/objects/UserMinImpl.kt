@file:Suppress("unused", "SpellCheckingInspection")

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
@JsonDeserialize(`as` = Void::class)
data class UserMinImpl(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Int? = null
) : UserMin
