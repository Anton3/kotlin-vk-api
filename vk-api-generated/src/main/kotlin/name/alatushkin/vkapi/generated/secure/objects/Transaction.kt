package name.alatushkin.vkapi.generated.secure.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
    val id: Long? = null,
    val uidFrom: Long? = null,
    val uidTo: Long? = null,
    val votes: Long? = null,
    val date: VkDate? = null
)
