@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property allLimit Campaign's total limit, rubles
 * @property dayLimit Campaign's day limit, rubles
 * @property id Campaign ID
 * @property name Campaign title
 * @property startTime Campaign start time, as Unixtime
 * @property status No description
 * @property stopTime Campaign stop time, as Unixtime
 * @property type No description
 */
data class Campaign(
    val allLimit: String,
    val dayLimit: String,
    val id: Int,
    val name: String,
    val startTime: Int,
    val status: AdStatus,
    val stopTime: Int,
    val type: CampaignType
)
