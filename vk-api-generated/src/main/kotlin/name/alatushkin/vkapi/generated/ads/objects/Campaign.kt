package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property id Campaign ID
 * @property type No description
 * @property name Campaign title
 * @property status No description
 * @property dayLimit Campaign's day limit, rubles
 * @property allLimit Campaign's total limit, rubles
 * @property startTime Campaign start time, as Unixtime
 * @property stopTime Campaign stop time, as Unixtime
 */
data class Campaign(
    val id: Long,
    val type: CampaignType,
    val name: String,
    val status: CampaignStatus,
    val dayLimit: String,
    val allLimit: String,
    val startTime: Long,
    val stopTime: Long
)
