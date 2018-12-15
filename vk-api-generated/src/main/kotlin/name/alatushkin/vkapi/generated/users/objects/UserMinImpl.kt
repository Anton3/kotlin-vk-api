package name.alatushkin.vkapi.generated.users.objects

/**
 * No description
 *
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property hidden Returns if a profile is hidden.
 */
data class UserMinImpl(
    override val id: Long,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Long? = null
) : UserMin
