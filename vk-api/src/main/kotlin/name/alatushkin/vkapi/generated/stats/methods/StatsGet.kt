@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.stats.objects.Period
import name.alatushkin.vkapi.tokens.UserMethod

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
    var groupId: Long? = null,
    var appId: Long? = null,
    var dateFrom: String? = null,
    var dateTo: String? = null
) : VkMethod<List<Period>>(
    "stats.get",
    jacksonTypeRef()
), UserMethod
