@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.RejectReason
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getRejectionReason]
 *
 * Returns a reason of ad rejection for pre-moderation.
 *
 * @property accountId Advertising account ID.
 * @property adId Ad ID.
 */
data class AdsGetRejectionReason(
    var accountId: Int,
    var adId: Int
) : VkMethod<RejectReason, UserMethod>("ads.getRejectionReason", jacksonTypeRef())
