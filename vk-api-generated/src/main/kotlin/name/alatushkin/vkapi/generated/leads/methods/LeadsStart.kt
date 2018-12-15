@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.leads.objects.Start
import name.alatushkin.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.start]
 *
 * Creates new session for the user passing the offer.
 *
 * @property leadId Lead ID.
 * @property secret Secret key from the lead testing interface.
 */
data class LeadsStart(
    var leadId: Long,
    var secret: String
) : VkMethod<Start>("leads.start", jacksonTypeRef()),
    UserServiceMethod
