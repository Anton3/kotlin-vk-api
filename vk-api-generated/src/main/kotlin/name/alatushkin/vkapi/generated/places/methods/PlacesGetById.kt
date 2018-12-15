@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.places.objects.PlaceMin
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getById]
 *
 * Returns information about locations by their IDs.
 *
 * @property places Location IDs.
 */
data class PlacesGetById(
    var places: List<Long>
) : VkMethod<List<PlaceMin>>("places.getById", jacksonTypeRef()),
    UserMethod
