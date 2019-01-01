@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createAds]
 *
 * Creates ads.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
 */
data class AdsCreateAds(
    var accountId: Int,
    var data: String
) : VkMethod<List<Int>>("ads.createAds", jacksonTypeRef()),
    UserMethod
