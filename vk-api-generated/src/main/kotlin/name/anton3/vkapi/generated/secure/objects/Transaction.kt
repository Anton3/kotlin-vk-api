@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Transaction date in Unixtime
 * @property id Transaction ID
 * @property uidFrom From ID
 * @property uidTo To ID
 * @property votes Votes number
 */
data class Transaction(
    val date: VkDate? = null,
    val id: Int? = null,
    val uidFrom: Int? = null,
    val uidTo: Int? = null,
    val votes: Int? = null
)
