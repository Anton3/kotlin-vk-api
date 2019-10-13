@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.DemoStats
import name.anton3.vkapi.generated.ads.objects.IdsType
import name.anton3.vkapi.generated.ads.objects.Period
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getDemographics]
 *
 * Returns demographics for ads or campaigns.
 *
 * @property accountId Advertising account ID.
 * @property idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns.
 * @property ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
 * @property period Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
 * @property dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
 * @property dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
 */
data class AdsGetDemographics(
    var accountId: Int,
    var idsType: IdsType,
    var ids: String,
    var period: Period,
    var dateFrom: String,
    var dateTo: String
) : VkMethod<List<DemoStats>, UserMethod>("ads.getDemographics", jacksonTypeRef())
