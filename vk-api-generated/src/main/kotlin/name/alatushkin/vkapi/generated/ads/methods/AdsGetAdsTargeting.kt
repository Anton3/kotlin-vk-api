@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.TargSettings
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsTargeting]
 *
 * Returns ad targeting parameters.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'For advertising agencies.' ID of the client ads are retrieved from.
 * @property includeDeleted flag that specifies whether archived ads shall be shown: *0 — show only active ads,, *1 — show all ads.
 * @property campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
 * @property adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
 * @property limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
 * @property offset Offset needed to return a specific subset of results.
 */
data class AdsGetAdsTargeting(
    var accountId: Long,
    var clientId: Long? = null,
    var includeDeleted: Boolean? = null,
    var campaignIds: String? = null,
    var adIds: String? = null,
    var limit: Long? = null,
    var offset: Long? = null
) : VkMethod<List<TargSettings>>("ads.getAdsTargeting", jacksonTypeRef()),
    UserMethod
