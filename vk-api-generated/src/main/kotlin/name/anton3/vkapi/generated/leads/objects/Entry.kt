package name.anton3.vkapi.generated.leads.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property uid User ID
 * @property aid Application ID
 * @property sid Session string ID
 * @property date Date when the action has been started in Unixtime
 * @property status Action type
 * @property testMode Information whether test mode is enabled
 * @property startDate Start date in Unixtime (for status=2)
 * @property comment Comment text
 */
data class Entry(
    val uid: Long? = null,
    val aid: Long? = null,
    val sid: String? = null,
    val date: VkDate? = null,
    val status: Long? = null,
    val testMode: Boolean? = null,
    val startDate: Long? = null,
    val comment: String? = null
)
