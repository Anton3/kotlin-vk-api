package name.anton3.vkapi.generated.secure.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Transaction ID
 * @property uidFrom From ID
 * @property uidTo To ID
 * @property votes Votes number
 * @property date Transaction date in Unixtime
 */
data class Transaction(
    val id: Int? = null,
    val uidFrom: Int? = null,
    val uidTo: Int? = null,
    val votes: Int? = null,
    val date: VkDate? = null
)
