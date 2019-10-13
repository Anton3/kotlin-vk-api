@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.objects

import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.OkResponse

/**
 * No description
 *
 * @property cost Offer cost
 * @property limit Offer limit
 * @property spent Amount of spent votes
 * @property success No description
 * @property testMode No description
 */
data class Complete(
    val cost: Int? = null,
    val limit: Int? = null,
    val spent: Int? = null,
    val success: OkResponse? = null,
    val testMode: BoolInt? = null
)
