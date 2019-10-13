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
 * @property isClosed No description
 * @property canAccessClosed No description
 */
@JsonDeserialize(`as` = Void::class)
data class UserMinImpl(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: UserMinDeactivated? = null,
    override val isClosed: BoolInt,
    override val canAccessClosed: BoolInt? = null
) : UserMin
