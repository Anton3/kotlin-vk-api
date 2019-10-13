@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Date when the reply has been created in Unixtime
 * @property id Reply ID
 * @property text Reply text
 */
data class Reply(
    val date: VkDate? = null,
    val id: Int? = null,
    val text: Int? = null
)
