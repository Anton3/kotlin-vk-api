@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.stats.objects.Period
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/stats.get]
 *
 * Returns statistics of a community or an application.
 *
 * @property groupId Community ID.
 * @property appId Application ID.
 * @property dateFrom Latest datestamp (in Unix time) of statistics to return.
 * @property dateTo End datestamp (in Unix time) of statistics to return.
 */
data class StatsGet(
    var groupId: Int? = null,
    var appId: Int? = null,
    var dateFrom: String? = null,
    var dateTo: String? = null
) : CheckedMethod<List<Period>, UserMethod>("stats.get", jacksonTypeRef())
