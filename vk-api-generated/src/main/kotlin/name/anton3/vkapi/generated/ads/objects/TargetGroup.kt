@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property audienceCount Audience
 * @property domain Site domain
 * @property id Group ID
 * @property lifetime Number of days for user to be in group
 * @property name Group name
 * @property pixel Pixel code
 */
data class TargetGroup(
    val audienceCount: Int? = null,
    val domain: String? = null,
    val id: Int? = null,
    val lifetime: Int? = null,
    val name: String? = null,
    val pixel: String? = null
)
