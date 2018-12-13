@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteAds]
 *
 * Archives ads.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with ad IDs.
 */
data class AdsDeleteAds(
    var accountId: Long,
    var ids: String
) : VkMethod<List<Long>>(
    "ads.deleteAds",
    jacksonTypeRef()
), UserMethod
