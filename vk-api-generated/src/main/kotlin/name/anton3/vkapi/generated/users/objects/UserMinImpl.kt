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
@JsonDeserialize(`as` = Void::class)
data class UserMinImpl(
    override val deactivated: String? = null,
    override val firstName: String,
    override val hidden: Int? = null,
    override val id: Int,
    override val lastName: String,
    override val canAccessClosed: Boolean? = null,
    override val isClosed: Boolean? = null
) : UserMin
