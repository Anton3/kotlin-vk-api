package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Reply ID
 * @property date Date when the reply has been created in Unixtime
 * @property text Reply text
 */
data class Reply(
    val id: Int? = null,
    val date: VkDate? = null,
    val text: Int? = null
)
