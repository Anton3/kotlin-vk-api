@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.users.objects.GetNearbyRadius
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/users.getNearby]
 *
 * Indexes current user location and returns nearby users.
 *
 * @property latitude geographic latitude of the place a user is located, in degrees (from -90 to 90)
 * @property longitude geographic longitude of the place a user is located, in degrees (from -180 to 180)
 * @property accuracy current location accuracy in meters
 * @property timeout time when a user disappears from location search results, in seconds
 * @property radius search zone radius type (1 to 4), :* 1 – 300 m,, :* 2 – 2400 m,, :* 3 – 18 km,, :* 4 – 150 km.
 * @property fields list of additional fields to return. Available values: sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters, screen_name, maiden_name, timezone, occupation
 * @property nameCase Case for declension of user name and surname: , nom –nominative (default) , gen – genitive , dat – dative , acc – accusative , ins – instrumental , abl – prepositional
 */
data class UsersGetNearby(
    var latitude: Double,
    var longitude: Double,
    var accuracy: Int? = null,
    var timeout: Int? = null,
    var radius: GetNearbyRadius? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : CheckedMethod<VkList<UserFull>, UserMethod>("users.getNearby", jacksonTypeRef())
