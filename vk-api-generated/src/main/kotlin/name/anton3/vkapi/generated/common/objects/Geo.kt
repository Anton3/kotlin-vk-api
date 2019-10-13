@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

/**
 * No description
 *
 * @property coordinates No description
 * @property place No description
 * @property showmap Information whether a map is showed
 * @property type Place type
 */
data class Geo(
    val coordinates: GeoCoordinates? = null,
    val place: Place? = null,
    val showmap: Int? = null,
    val type: String? = null
)
