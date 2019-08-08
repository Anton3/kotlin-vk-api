@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.ads.objects.Period
import name.anton3.vkapi.generated.ads.objects.Stats
import name.anton3.vkapi.generated.ads.objects.Type
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getStatistics]
 *
 * Returns statistics of performance indicators for ads, campaigns, clients or the whole account.
 *
 * @property accountId Advertising account ID.
 * @property idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns,, *client — clients,, *office — account.
 * @property ids IDs requested ads, campaigns, clients or account, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
 * @property period Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
 * @property dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
 * @property dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
 */
data class AdsGetStatistics(
    var accountId: Int,
    var idsType: Type,
    var ids: String,
    var period: Period,
    var dateFrom: String,
    var dateTo: String
) : VkMethod<List<Stats>>("ads.getStatistics", jacksonTypeRef()),
    UserMethod
