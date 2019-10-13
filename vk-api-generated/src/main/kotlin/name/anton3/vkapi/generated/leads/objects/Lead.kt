@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.objects

/**
 * No description
 *
 * @property completed Completed offers number
 * @property cost Offer cost
 * @property days No description
 * @property impressions Impressions number
 * @property limit Lead limit
 * @property spent Amount of spent votes
 * @property started Started offers number
 */
data class Lead(
    val completed: Int? = null,
    val cost: Int? = null,
    val days: LeadDays? = null,
    val impressions: Int? = null,
    val limit: Int? = null,
    val spent: Int? = null,
    val started: Int? = null
)
