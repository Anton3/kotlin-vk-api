@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.objects

/**
 * No description
 *
 * @property limit Lead limit
 * @property spent Amount of spent votes
 * @property cost Offer cost
 * @property impressions Impressions number
 * @property started Started offers number
 * @property completed Completed offers number
 * @property days No description
 */
data class Lead(
    val limit: Int? = null,
    val spent: Int? = null,
    val cost: Int? = null,
    val impressions: Int? = null,
    val started: Int? = null,
    val completed: Int? = null,
    val days: LeadDays? = null
)
