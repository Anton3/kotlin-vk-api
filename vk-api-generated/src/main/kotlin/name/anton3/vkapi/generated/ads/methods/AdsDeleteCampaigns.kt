@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.deleteCampaigns]
 *
 * Archives advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted campaigns.
 */
data class AdsDeleteCampaigns(
    var accountId: Int,
    var ids: String
) : VkMethod<Int, UserMethod>("ads.deleteCampaigns", jacksonTypeRef())
