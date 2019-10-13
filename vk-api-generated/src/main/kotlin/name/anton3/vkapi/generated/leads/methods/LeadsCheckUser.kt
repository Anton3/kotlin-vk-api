@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.leads.objects.Checked
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/leads.checkUser]
 *
 * Checks if the user can start the lead.
 *
 * @property leadId Lead ID.
 * @property testResult Value to be return in 'result' field when test mode is used.
 * @property testMode No description
 * @property autoStart No description
 * @property age User age.
 * @property country User country code.
 */
data class LeadsCheckUser(
    var leadId: Int,
    var testResult: Int? = null,
    var autoStart: Boolean? = null,
    var age: Int? = null,
    var country: String? = null
) : VkMethod<Checked, UserMethod>("leads.checkUser", jacksonTypeRef())
