@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.places.objects.PlaceMin
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/places.getById]
 *
 * Returns information about locations by their IDs.
 *
 * @property places Location IDs.
 */
data class PlacesGetById(
    var places: List<Int>
) : VkMethod<List<PlaceMin>, UserMethod>("places.getById", jacksonTypeRef())
