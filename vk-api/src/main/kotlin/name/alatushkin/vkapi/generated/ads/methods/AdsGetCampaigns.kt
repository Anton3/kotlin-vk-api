@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.Campaign
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getCampaigns]
 *
 * Returns a list of campaigns in an advertising account.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'For advertising agencies'. ID of the client advertising campaigns are retrieved from.
 * @property includeDeleted Flag that specifies whether archived ads shall be shown. *0 — show only active campaigns,, *1 — show all campaigns.
 * @property campaignIds Filter of advertising campaigns to show. Serialized JSON array with campaign IDs. Only campaigns that exist in 'campaign_ids' and belong to the specified advertising account will be shown. If the parameter is null, all campaigns will be shown.
 */
data class AdsGetCampaigns(
    var accountId: Long,
    var clientId: Long? = null,
    var includeDeleted: Boolean? = null,
    var campaignIds: String? = null
) : VkMethod<List<Campaign>>(
    "ads.getCampaigns",
    jacksonTypeRef()
), UserMethod
