package name.alatushkin.vkapi.generated.leads.objects

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
    val limit: Long? = null,
    val spent: Long? = null,
    val cost: Long? = null,
    val impressions: Long? = null,
    val started: Long? = null,
    val completed: Long? = null,
    val days: LeadDays? = null
)
