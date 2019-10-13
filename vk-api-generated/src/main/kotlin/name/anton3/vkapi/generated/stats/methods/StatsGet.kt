@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.stats.objects.Period
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/stats.get]
 *
 * Returns statistics of a community or an application.
 *
 * @property groupId Community ID.
 * @property appId Application ID.
 * @property timestampFrom No description
 * @property timestampTo No description
 * @property interval No description
 * @property intervalsCount No description
 * @property filters No description
 * @property statsGroups No description
 * @property extended No description
 */
data class StatsGet(
    var groupId: Int? = null,
    var appId: Int? = null,
    var timestampFrom: Int? = null,
    var timestampTo: Int? = null,
    var interval: String? = null,
    var intervalsCount: Int? = null,
    var filters: List<String>? = null,
    var statsGroups: List<String>? = null,
    var extended: Boolean? = null
) : VkMethod<List<Period>, UserMethod>("stats.get", jacksonTypeRef())
