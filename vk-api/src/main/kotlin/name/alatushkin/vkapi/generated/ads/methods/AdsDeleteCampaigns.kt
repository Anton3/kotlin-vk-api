@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

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
) : VkMethod<Long>(
    "ads.deleteCampaigns",
    jacksonTypeRef()
), UserMethod
