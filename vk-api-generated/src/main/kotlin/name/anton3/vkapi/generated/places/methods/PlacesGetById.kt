@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.places.objects.PlaceMin
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getById]
 *
 * Returns information about locations by their IDs.
 *
 * @property places Location IDs.
 */
data class PlacesGetById(
    var places: List<Int>
) : VkMethod<List<PlaceMin>>("places.getById", jacksonTypeRef()),
    UserMethod
