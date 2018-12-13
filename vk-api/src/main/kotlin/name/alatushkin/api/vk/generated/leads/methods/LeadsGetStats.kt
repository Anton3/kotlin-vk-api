@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.leads.objects.Lead
import name.alatushkin.api.vk.tokens.UserMethod

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
    var leadId: Long,
    var secret: String? = null,
    var dateStart: String? = null,
    var dateEnd: String? = null
) : VkMethod<Lead>(
    "leads.getStats",
    jacksonTypeRef()
), UserMethod
