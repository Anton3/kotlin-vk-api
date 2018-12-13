@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateAds]
 *
 * Edits ads.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in ads. Description of 'ad_edit_specification' objects see below.
 */
data class AdsUpdateAds(
    var accountId: Long,
    var data: String
) : VkMethod<List<Long>>(
    "ads.updateAds",
    jacksonTypeRef()
), UserMethod
