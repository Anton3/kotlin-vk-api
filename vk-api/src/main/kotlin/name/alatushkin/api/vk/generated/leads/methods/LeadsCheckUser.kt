@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.leads.objects.Checked
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/leads.checkUser]
 *
 * Checks if the user can start the lead.
 *
 * @property leadId Lead ID.
 * @property testResult Value to be return in 'result' field when test mode is used.
 * @property age User age.
 * @property country User country code.
 */
data class LeadsCheckUser(
    var leadId: Long,
    var testResult: Long? = null,
    var age: Long? = null,
    var country: String? = null
) : VkMethod<Checked>(
    "leads.checkUser",
    jacksonTypeRef()
), UserMethod
