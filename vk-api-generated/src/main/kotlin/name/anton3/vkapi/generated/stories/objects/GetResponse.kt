@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property count Stories count
 * @property items No description
 * @property promoData No description
 */
data class GetResponse(
    val count: Int,
    val items: List<Story>,
    val promoData: PromoBlock? = null
)
