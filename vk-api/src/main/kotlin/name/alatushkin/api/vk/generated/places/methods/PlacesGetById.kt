@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.places.objects.PlaceMin
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getById]
 *
 * Returns information about locations by their IDs.
 *
 * @property places Location IDs.
 */
data class PlacesGetById(
    var places: List<Long>
) : VkMethod<List<PlaceMin>>(
    "places.getById",
    jacksonTypeRef()
), UserMethod
