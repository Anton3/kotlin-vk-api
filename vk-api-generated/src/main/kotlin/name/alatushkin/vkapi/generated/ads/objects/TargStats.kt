package name.alatushkin.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property audienceCount Audience
 * @property recommendedCpc Recommended CPC value
 * @property recommendedCpm Recommended CPM value
 */
data class TargStats(
    val audienceCount: Long,
    val recommendedCpc: Double? = null,
    val recommendedCpm: Double? = null
)
