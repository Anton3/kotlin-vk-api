@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateCampaigns]
 *
 * Edits advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
 */
data class AdsUpdateCampaigns(
    var accountId: Long,
    var data: String
) : VkMethod<Long>(
    "ads.updateCampaigns",
    jacksonTypeRef()
), UserMethod
