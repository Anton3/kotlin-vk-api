@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.leads.objects.MetricHitResponse
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.metricHit]
 *
 * Counts the metric event.
 *
 * @property data Metric data obtained in the lead interface.
 */
data class LeadsMetricHit(
    var data: String
) : VkMethod<MetricHitResponse>("leads.metricHit", jacksonTypeRef()),
    UserServiceMethod
