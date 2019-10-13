@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Additional data for promo stories
 *
 * @property name Promo story title
 * @property photo50 RL of square photo of the story with 50 pixels in width
 * @property photo100 RL of square photo of the story with 100 pixels in width
 * @property notAnimated Hide animation for promo story
 */
data class PromoBlock(
    val name: String? = null,
    @get:JsonProperty("photo_50") val photo50: String? = null,
    @get:JsonProperty("photo_100") val photo100: String? = null,
    val notAnimated: Boolean? = null
)
