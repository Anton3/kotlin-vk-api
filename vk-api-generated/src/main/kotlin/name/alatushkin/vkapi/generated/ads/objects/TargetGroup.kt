package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property id Group ID
 * @property name Group name
 * @property domain Site domain
 * @property audienceCount Audience
 * @property lifetime Number of days for user to be in group
 * @property pixel Pixel code
 */
data class TargetGroup(
    val id: Long? = null,
    val name: String? = null,
    val domain: String? = null,
    val audienceCount: Long? = null,
    val lifetime: Long? = null,
    val pixel: String? = null
)
