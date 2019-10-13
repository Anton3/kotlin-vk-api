@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.objects

import name.anton3.vkapi.generated.common.objects.Image

/**
 * No description
 *
 * @property button Button key
 * @property buttonText Button text in current language
 * @property cardId Card ID (long int returned as string)
 * @property images No description
 * @property linkUrl Link URL
 * @property photo Photo ID (format "<owner_id>_<media_id>")
 * @property price Price if set (decimal number returned as string)
 * @property priceOld Old price if set (decimal number returned as string)
 * @property title Title
 */
data class PrettyCard(
    val button: String? = null,
    val buttonText: String? = null,
    val cardId: String,
    val images: List<Image>? = null,
    val linkUrl: String,
    val photo: String,
    val price: String? = null,
    val priceOld: String? = null,
    val title: String
)
