package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.common.objects.Place

/**
 * Place information
 *
 * @property type place type
 * @property coordinates place coordinates
 * @property place No description
 */
data class PinnedMessageGeo(
    val type: String,
    val coordinates: String,
    val place: Place? = null
)
