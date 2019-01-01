@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

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
) : VkMethod<List<Int>>("ads.deleteAds", jacksonTypeRef()),
    UserMethod
