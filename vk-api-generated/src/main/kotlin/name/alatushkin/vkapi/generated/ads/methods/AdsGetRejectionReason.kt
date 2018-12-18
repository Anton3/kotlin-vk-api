@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.ads.objects.RejectReason
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getRejectionReason]
 *
 * Returns a reason of ad rejection for pre-moderation.
 *
 * @property accountId Advertising account ID.
 * @property adId Ad ID.
 */
data class AdsGetRejectionReason(
    var accountId: Long,
    var adId: Long
) : VkMethod<RejectReason>("ads.getRejectionReason", jacksonTypeRef()),
    UserMethod
