@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.generated.common.objects.Place

/**
 * No description
 *
 * @property coordinates Coordinates as string. <latitude> <longtitude>
 * @property place No description
 * @property showmap Information whether a map is showed
 * @property type Place type
 */
data class Geo(
    val coordinates: String? = null,
    val place: Place? = null,
    val showmap: Int? = null,
    val type: String? = null
)
