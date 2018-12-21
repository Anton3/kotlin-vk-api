@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.places.objects.PlaceFull
import name.anton3.vkapi.generated.places.objects.SearchRadius
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/places.search]
 *
 * Returns a list of locations that match the search criteria.
 *
 * @property q Search query string.
 * @property city City ID.
 * @property latitude Geographical latitude of the initial search point, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude of the initial search point, in degrees (from '-180' to '180').
 * @property radius Radius of the search zone: '1' — 100 m. (default), '2' — 800 m. '3' — 6 km. '4' — 50 km.
 * @property offset Offset needed to return a specific subset of locations.
 * @property count Number of locations to return.
 */
data class PlacesSearch(
    var q: String? = null,
    var city: Long? = null,
    var latitude: Double,
    var longitude: Double,
    var radius: SearchRadius? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<PlaceFull>>("places.search", jacksonTypeRef()),
    UserMethod
