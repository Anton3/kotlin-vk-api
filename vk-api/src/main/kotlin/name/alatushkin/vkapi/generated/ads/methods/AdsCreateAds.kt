@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createAds]
 *
 * Creates ads.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
 */
data class AdsCreateAds(
    var accountId: Long,
    var data: String
) : VkMethod<List<Long>>(
    "ads.createAds",
    jacksonTypeRef()
), UserMethod
