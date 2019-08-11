@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.places.objects.Types
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/places.getTypes]
 *
 * Returns a list of all types of locations.
 *

 */
class PlacesGetTypes : CheckedMethod<List<Types>, UserMethod>("places.getTypes", jacksonTypeRef())
