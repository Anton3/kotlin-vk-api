@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.utils.objects.GetLinkStatsInterval
import name.alatushkin.api.vk.generated.utils.objects.LinkStatsExtended
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

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
) : VkMethod<LinkStatsExtended>(
    "utils.getLinkStats",
    jacksonTypeRef()
), UserGroupServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
