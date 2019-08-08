@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.ads.objects.GetTargetingStatsAdFormat
import name.anton3.vkapi.generated.ads.objects.TargStats
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getTargetingStats]
 *
 * Returns the size of targeting audience, and also recommended values for CPC and CPM.
 *
 * @property accountId Advertising account ID.
 * @property criteria Serialized JSON object that describes targeting parameters. Description of 'criteria' object see below.
 * @property adId ID of an ad which targeting parameters shall be analyzed.
 * @property adFormat Ad format. Possible values: *'1' — image and text,, *'2' — big image,, *'3' — exclusive format,, *'4' — community, square image,, *'7' — special app format,, *'8' — special community format,, *'9' — post in community,, *'10' — app board.
 * @property adPlatform Platforms to use for ad showing. Possible values: (for 'ad_format' = '1'), *'0' — VK and partner sites,, *'1' — VK only. (for 'ad_format' = '9'), *'all' — all platforms,, *'desktop' — desktop version,, *'mobile' — mobile version and apps.
 * @property linkUrl URL for the advertised object.
 * @property linkDomain Domain of the advertised object.
 */
data class AdsGetTargetingStats(
    var accountId: Int,
    var criteria: String? = null,
    var adId: Int? = null,
    var adFormat: GetTargetingStatsAdFormat? = null,
    var adPlatform: String? = null,
    var linkUrl: String,
    var linkDomain: String? = null
) : VkMethod<TargStats>("ads.getTargetingStats", jacksonTypeRef()),
    UserMethod
