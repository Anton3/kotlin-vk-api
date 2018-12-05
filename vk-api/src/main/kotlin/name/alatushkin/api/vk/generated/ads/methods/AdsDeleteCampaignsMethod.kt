@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteCampaigns]
 *
 * Archives advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted campaigns.
 */
class AdsDeleteCampaignsMethod(
        accountId: Long,
        ids: String
) : VkMethod<Long>(
    "ads.deleteCampaigns",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var accountId: Long by props
    var ids: String by props

    init {
        this.accountId = accountId
        this.ids = ids
    }

    fun setAccountId(accountId: Long): AdsDeleteCampaignsMethod {
        this.accountId = accountId
        return this
    }

    fun setIds(ids: String): AdsDeleteCampaignsMethod {
        this.ids = ids
        return this
    }
}
