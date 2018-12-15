@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.CheckLinkLinkType
import name.alatushkin.vkapi.generated.ads.objects.LinkStatus
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.checkLink]
 *
 * Allows to check the ad link.
 *
 * @property accountId Advertising account ID.
 * @property linkType Object type: *'community' — community,, *'post' — community post,, *'application' — VK application,, *'video' — video,, *'site' — external site.
 * @property linkUrl Object URL.
 * @property campaignId Campaign ID
 */
data class AdsCheckLink(
    var accountId: Long,
    var linkType: CheckLinkLinkType,
    var linkUrl: String,
    var campaignId: Long? = null
) : VkMethod<LinkStatus>("ads.checkLink", jacksonTypeRef()),
    UserMethod
