@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createCampaigns]
 *
 * Creates advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created campaigns. Description of 'campaign_specification' objects see below.
 */
data class AdsCreateCampaigns(
    var accountId: Long,
    var data: String
) : VkMethod<List<Long>>(
    "ads.createCampaigns",
    jacksonTypeRef()
), UserMethod
