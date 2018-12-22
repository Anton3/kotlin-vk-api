@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteCampaigns]
 *
 * Archives advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted campaigns.
 */
data class AdsDeleteCampaigns(
    var accountId: Long,
    var ids: String
) : VkMethod<Long>("ads.deleteCampaigns", jacksonTypeRef()),
    UserMethod