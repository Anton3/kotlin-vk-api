@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.TargSettings
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getAdsTargeting]
 *
 * Returns ad targeting parameters.
 *
 * @property accountId Advertising account ID.
 * @property adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
 * @property campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
 * @property clientId 'For advertising agencies.' ID of the client ads are retrieved from.
 * @property includeDeleted flag that specifies whether archived ads shall be shown: *0 — show only active ads,, *1 — show all ads.
 * @property limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
 * @property offset Offset needed to return a specific subset of results.
 */
data class AdsGetAdsTargeting(
    var accountId: Int,
    var adIds: String? = null,
    var campaignIds: String? = null,
    var clientId: Int? = null,
    var includeDeleted: Boolean? = null,
    var limit: Int? = null,
    var offset: Int? = null
) : VkMethod<List<TargSettings>, UserMethod>("ads.getAdsTargeting", jacksonTypeRef())
