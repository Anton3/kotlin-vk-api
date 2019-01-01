@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.ads.objects.PostStats
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsPostsReach]
 *
 * Allows to get detailed information about the ad post reach.
 *
 * @property accountId Advertising account ID.
 * @property adsIds Ads IDS separated by comma.
 */
data class AdsGetAdsPostsReach(
    var accountId: Int,
    var adsIds: String
) : VkMethod<List<PostStats>>("ads.getAdsPostsReach", jacksonTypeRef()),
    UserMethod
