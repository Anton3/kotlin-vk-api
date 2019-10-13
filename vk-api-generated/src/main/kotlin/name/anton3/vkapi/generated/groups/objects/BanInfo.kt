@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property adminId Administrator ID
 * @property comment Comment for a ban
 * @property commentVisible Show comment for user
 * @property isClosed No description
 * @property date Date when user has been added to blacklist in Unixtime
 * @property endDate Date when user will be removed from blacklist in Unixtime
 * @property reason No description
 */
data class BanInfo(
    val adminId: Int? = null,
    val comment: String? = null,
    val commentVisible: Boolean? = null,
    val isClosed: Boolean? = null,
    val date: VkDate? = null,
    val endDate: Int? = null,
    val reason: BanInfoReason? = null
)
