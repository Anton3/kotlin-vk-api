@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property countryId Country ID
 * @property from From year
 * @property id Military ID
 * @property unit Unit name
 * @property unitId Unit ID
 * @property until Till year
 */
data class Military(
    val countryId: Int,
    val from: Int? = null,
    val id: Int? = null,
    val unit: String,
    val unitId: Int,
    val until: Int? = null
)
