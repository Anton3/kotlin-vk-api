package name.alatushkin.vkapi.generated.common.objects

/**
 * No description
 *
 * @property type Place type
 * @property coordinates No description
 * @property place No description
 * @property showmap Information whether a map is showed
 */
data class Geo(
    val type: String? = null,
    val coordinates: GeoCoordinates? = null,
    val place: Place? = null,
    val showmap: Long? = null
)
