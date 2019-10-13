@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.utils.objects.GetLinkStatsInterval
import name.anton3.vkapi.generated.utils.objects.GetLinkStatsSource
import name.anton3.vkapi.generated.utils.objects.LinkStats
import name.anton3.vkapi.method.UserGroupServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/utils.getLinkStats]
 *
 * Returns stats data for shortened link.
 *
 * @property key Link key (characters after vk.cc/).
 * @property source Source of scope
 * @property accessKey Access key for private link stats.
 * @property interval Interval.
 * @property intervalsCount Number of intervals to return.
 */
data class UtilsGetLinkStats(
    var key: String,
    var source: GetLinkStatsSource? = null,
    var accessKey: String? = null,
    var interval: GetLinkStatsInterval? = null,
    var intervalsCount: Int? = null
) : VkMethod<LinkStats, UserGroupServiceMethod>("utils.getLinkStats", jacksonTypeRef())
