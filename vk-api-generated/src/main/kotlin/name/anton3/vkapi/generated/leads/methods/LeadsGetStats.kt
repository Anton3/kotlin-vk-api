@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.leads.objects.Lead
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/leads.getStats]
 *
 * Returns lead stats data.
 *
 * @property leadId Lead ID.
 * @property secret Secret key obtained from the lead testing interface.
 * @property dateStart Day to start stats from (YYYY_MM_DD, e.g.2011-09-17).
 * @property dateEnd Day to finish stats (YYYY_MM_DD, e.g.2011-09-17).
 */
data class LeadsGetStats(
    var leadId: Int,
    var secret: String? = null,
    var dateStart: String? = null,
    var dateEnd: String? = null
) : VkMethod<Lead, UserMethod>("leads.getStats", jacksonTypeRef())
