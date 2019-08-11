@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.updateCampaigns]
 *
 * Edits advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
 */
data class AdsUpdateCampaigns(
    var accountId: Int,
    var data: String
) : CheckedMethod<Int, UserMethod>("ads.updateCampaigns", jacksonTypeRef())
