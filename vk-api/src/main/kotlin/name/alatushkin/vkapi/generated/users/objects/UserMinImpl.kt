package name.alatushkin.vkapi.generated.users.objects

data class UserMinImpl(
    override val id: Long,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Long? = null
) : UserMin
