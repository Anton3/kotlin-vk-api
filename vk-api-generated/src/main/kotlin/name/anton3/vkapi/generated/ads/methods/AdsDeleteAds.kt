@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.deleteAds]
 *
 * Archives ads.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with ad IDs.
 */
data class AdsDeleteAds(
    var accountId: Int,
    var ids: String
) : VkMethod<List<Int>, UserMethod>("ads.deleteAds", jacksonTypeRef())
