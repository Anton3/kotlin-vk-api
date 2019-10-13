@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.IdsType
import name.anton3.vkapi.generated.ads.objects.PromotedPostReach
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getPostsReach]
 *
 * Returns detailed statistics of promoted posts reach from campaigns and ads.
 *
 * @property accountId Advertising account ID.
 * @property idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns.
 * @property ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 100 objects.
 */
data class AdsGetPostsReach(
    var accountId: Int,
    var idsType: IdsType,
    var ids: String
) : VkMethod<List<PromotedPostReach>, UserMethod>("ads.getPostsReach", jacksonTypeRef())
