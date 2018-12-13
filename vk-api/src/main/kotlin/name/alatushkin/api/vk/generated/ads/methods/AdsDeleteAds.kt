@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

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
