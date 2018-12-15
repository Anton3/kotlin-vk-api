@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.utils.objects.GetLinkStatsInterval
import name.alatushkin.vkapi.generated.utils.objects.LinkStatsExtended
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod

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
    var intervalsCount: Long? = null
) : VkMethod<LinkStatsExtended>("utils.getLinkStats", jacksonTypeRef()),
    UserGroupServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
