@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

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
) : VkMethod<Long>("ads.updateCampaigns", jacksonTypeRef()),
    UserMethod
