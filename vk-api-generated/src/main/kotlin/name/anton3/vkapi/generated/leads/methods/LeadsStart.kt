@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.leads.objects.Start
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/leads.start]
 *
 * Creates new session for the user passing the offer.
 *
 * @property leadId Lead ID.
 * @property secret Secret key from the lead testing interface.
 * @property uid No description
 * @property aid No description
 * @property testMode No description
 * @property force No description
 */
data class LeadsStart(
    var leadId: Int,
    var secret: String,
    var uid: Int? = null,
    var aid: Int? = null,
    var force: Boolean? = null
) : VkMethod<Start, UserServiceMethod>("leads.start", jacksonTypeRef())
