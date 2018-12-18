package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property adminId Administrator ID
 * @property date Date when user has been added to blacklist in Unixtime
 * @property reason No description
 * @property comment Comment for a ban
 * @property endDate Date when user will be removed from blacklist in Unixtime
 */
data class BanInfo(
    val adminId: Long? = null,
    val date: VkDate? = null,
    val reason: BanInfoReason? = null,
    val comment: String? = null,
    val endDate: Long? = null
)
