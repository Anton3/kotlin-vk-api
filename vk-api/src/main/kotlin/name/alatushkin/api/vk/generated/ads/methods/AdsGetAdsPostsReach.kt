@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.PostStats
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsPostsReach]
 *
 * Allows to get detailed information about the ad post reach.
 *
 * @property accountId Advertising account ID.
 * @property adsIds Ads IDS separated by comma.
 */
data class AdsGetAdsPostsReach(
    var accountId: Long,
    var adsIds: String
) : VkMethod<List<PostStats>>(
    "ads.getAdsPostsReach",
    jacksonTypeRef()
), UserMethod
