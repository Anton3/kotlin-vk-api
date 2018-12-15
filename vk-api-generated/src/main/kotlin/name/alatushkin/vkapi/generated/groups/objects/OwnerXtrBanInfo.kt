package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property type No description
 * @property group Information about group if type = group
 * @property profile Information about group if type = profile
 * @property banInfo No description
 */
data class OwnerXtrBanInfo(
    val type: OwnerXtrBanInfoType? = null,
    val group: Group? = null,
    val profile: User? = null,
    val banInfo: BanInfo? = null
)
