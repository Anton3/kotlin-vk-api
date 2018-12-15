@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.places.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.places.objects.CheckinResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/places.checkin]
 *
 * Checks a user in at the specified location.
 *
 * @property placeId Location ID.
 * @property text Text of the comment on the check-in (255 characters maximum, line breaks not supported).
 * @property latitude Geographical latitude of the check-in, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude of the check-in, in degrees (from '-180' to '180').
 * @property friendsOnly '1' — Check-in will be available only for friends. '0' — Check-in will be available for all users (default).
 * @property services List of services or websites (e.g., 'twitter', 'facebook') to which the check-in will be exported, if the user has set up the respective option.
 */
data class PlacesCheckin(
    var placeId: Long? = null,
    var text: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var friendsOnly: Boolean? = null,
    var services: List<String>? = null
) : VkMethod<CheckinResponse>("places.checkin", jacksonTypeRef()),
    UserMethod
