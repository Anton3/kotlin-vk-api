@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.updateAds]
 *
 * Edits ads.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in ads. Description of 'ad_edit_specification' objects see below.
 */
data class AdsUpdateAds(
    var accountId: Int,
    var data: String
) : VkMethod<List<Int>, UserMethod>("ads.updateAds", jacksonTypeRef())
