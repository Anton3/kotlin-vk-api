package name.anton3.vkapi.generated.leads.objects

import name.anton3.vkapi.vktypes.OkResponse

/**
 * No description
 *
 * @property limit Offer limit
 * @property spent Amount of spent votes
 * @property cost Offer cost
 * @property testMode Information whether test mode is enabled
 * @property success No description
 */
data class Complete(
    val limit: Int? = null,
    val spent: Int? = null,
    val cost: Int? = null,
    val testMode: Boolean? = null,
    val success: OkResponse? = null
)
