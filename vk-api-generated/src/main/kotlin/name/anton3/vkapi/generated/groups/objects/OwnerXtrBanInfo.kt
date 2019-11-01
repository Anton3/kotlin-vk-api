@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property banInfo No description
 * @property group Information about group if type = group
 * @property profile Information about group if type = profile
 * @property type No description
 */
@JsonDeserialize(`as` = Void::class)
data class OwnerXtrBanInfo(
    val banInfo: BanInfo? = null,
    val group: Group? = null,
    val profile: User? = null,
    val type: OwnerXtrBanInfoType? = null
) : BannedItem
