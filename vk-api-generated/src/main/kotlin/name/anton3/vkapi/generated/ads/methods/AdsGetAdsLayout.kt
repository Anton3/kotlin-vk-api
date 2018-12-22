@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.ads.objects.AdLayout
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsLayout]
 *
 * Returns descriptions of ad layouts.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'For advertising agencies.' ID of the client ads are retrieved from.
 * @property includeDeleted Flag that specifies whether archived ads shall be shown. *0 — show only active ads,, *1 — show all ads.
 * @property campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
 * @property adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
 * @property limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
 * @property offset Offset. Used in the same cases as 'limit' parameter.
 */
data class AdsGetAdsLayout(
    var accountId: Long,
    var clientId: Long? = null,
    var includeDeleted: Boolean? = null,
    var campaignIds: String? = null,
    var adIds: String? = null,
    var limit: Long? = null,
    var offset: Long? = null
) : VkMethod<List<AdLayout>>("ads.getAdsLayout", jacksonTypeRef()),
    UserMethod