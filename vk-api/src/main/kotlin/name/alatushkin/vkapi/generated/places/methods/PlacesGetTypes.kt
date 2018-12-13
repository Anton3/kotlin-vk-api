@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.places.objects.Types
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getTypes]
 *
 * Returns a list of all types of locations.
 *

 */
class PlacesGetTypes : VkMethod<List<Types>>(
    "places.getTypes",
    jacksonTypeRef()
), UserMethod
