package name.alatushkin.vkapi.generated.notifications.objects

import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Reply ID
 * @property date Date when the reply has been created in Unixtime
 * @property text Reply text
 */
data class Reply(
    val id: Long? = null,
    val date: VkDate? = null,
    val text: Long? = null
)
