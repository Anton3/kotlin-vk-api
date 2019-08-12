@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.utils.objects.GetLinkStatsInterval
import name.anton3.vkapi.generated.utils.objects.LinkStatsExtended
import name.anton3.vkapi.method.UserGroupServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/utils.getLinkStats]
 *
 * Returns stats data for shortened link.
 *
 * @property key Link key (characters after vk.cc/).
 * @property accessKey Access key for private link stats.
 * @property interval Interval.
 * @property intervalsCount Number of intervals to return.
 */
data class UtilsGetLinkStatsExtended(
    var key: String,
    var accessKey: String? = null,
    var interval: GetLinkStatsInterval? = null,
    var intervalsCount: Int? = null
) : VkMethod<LinkStatsExtended, UserGroupServiceMethod>("utils.getLinkStats", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
