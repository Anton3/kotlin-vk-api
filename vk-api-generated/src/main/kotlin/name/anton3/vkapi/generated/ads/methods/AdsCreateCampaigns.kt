@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.createCampaigns]
 *
 * Creates advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created campaigns. Description of 'campaign_specification' objects see below.
 */
data class AdsCreateCampaigns(
    var accountId: Int,
    var data: String
) : CheckedMethod<List<Int>, UserMethod>("ads.createCampaigns", jacksonTypeRef())
