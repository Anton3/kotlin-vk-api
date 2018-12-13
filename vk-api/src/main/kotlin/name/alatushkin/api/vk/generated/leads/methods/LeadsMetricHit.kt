@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.leads.objects.MetricHitResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.metricHit]
 *
 * Counts the metric event.
 *
 * @property data Metric data obtained in the lead interface.
 */
data class LeadsMetricHit(
    var data: String
) : VkMethod<MetricHitResponse>(
    "leads.metricHit",
    jacksonTypeRef()
), UserServiceMethod
