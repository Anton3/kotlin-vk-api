@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.places.objects.Checkin
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/places.getCheckins]
 *
 * Returns a list of user check-ins at locations according to the set parameters.
 *
 * @property latitude Geographical latitude of the initial search point, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude of the initial search point, in degrees (from '-180' to '180').
 * @property place Location ID of check-ins to return. (Ignored if 'latitude' and 'longitude' are specified.)
 * @property userId 
 * @property offset Offset needed to return a specific subset of check-ins. (Ignored if 'timestamp' is not null.)
 * @property count Number of check-ins to return. (Ignored if 'timestamp' is not null.)
 * @property timestamp Specifies that only those check-ins created after the specified timestamp will be returned.
 * @property friendsOnly '1' — to return only check-ins with set geographical coordinates. (Ignored if 'latitude' and 'longitude' are not set.)
 * @property needPlaces '1' — to return location information with the check-ins. (Ignored if 'place' is not set.),
 */
data class PlacesGetCheckins(
    var latitude: Double? = null,
    var longitude: Double? = null,
    var place: Long? = null,
    var userId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var timestamp: Long? = null,
    var friendsOnly: Boolean? = null,
    var needPlaces: Boolean? = null
) : VkMethod<VkList<Checkin>>(
    "places.getCheckins",
    jacksonTypeRef()
), UserMethod
