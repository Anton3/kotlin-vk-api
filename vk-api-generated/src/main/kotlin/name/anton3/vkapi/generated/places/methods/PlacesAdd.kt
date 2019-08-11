@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.places.objects.AddResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/places.add]
 *
 * Adds a new location to the location database.
 *
 * @property type ID of the location's type (e.g., '1' — Home, '2' — Work). To get location type IDs, use the [vk.com/dev/places.getTypes|places.getTypes] method.
 * @property title Title of the location.
 * @property latitude Geographical latitude, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude, in degrees (from '-180' to '180').
 * @property country ID of the location's country. To get country IDs, use the [vk.com/dev/database.getCountries|database.getCountries] method.
 * @property city ID of the location's city. To get city IDs, use the [vk.com/dev/database.getCities|database.getCities] method.
 * @property address Street address of the location (e.g., '125 Elm Street').
 */
data class PlacesAdd(
    var type: Int? = null,
    var title: String,
    var latitude: Double,
    var longitude: Double,
    var country: Int? = null,
    var city: Int? = null,
    var address: String? = null
) : CheckedMethod<AddResponse, UserMethod>("places.add", jacksonTypeRef())
