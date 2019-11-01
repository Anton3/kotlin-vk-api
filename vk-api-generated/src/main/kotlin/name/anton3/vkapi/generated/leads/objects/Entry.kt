@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.objects

import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property aid Application ID
 * @property comment Comment text
 * @property date Date when the action has been started in Unixtime
 * @property sid Session string ID
 * @property startDate Start date in Unixtime (for status=2)
 * @property status Action type
 * @property testMode Information whether test mode is enabled
 * @property uid User ID
 */
data class Entry(
    val aid: Int? = null,
    val comment: String? = null,
    val date: VkDate? = null,
    val sid: String? = null,
    val startDate: Int? = null,
    val status: Int? = null,
    val testMode: BoolInt? = null,
    val uid: Int? = null
)
