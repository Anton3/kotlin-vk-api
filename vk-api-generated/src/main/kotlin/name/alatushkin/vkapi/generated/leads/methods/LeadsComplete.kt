@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.leads.objects.Complete
import name.alatushkin.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.complete]
 *
 * Completes the lead started by user.
 *
 * @property vkSid Session obtained as GET parameter when session started.
 * @property secret Secret key from the lead testing interface.
 * @property comment Comment text.
 */
data class LeadsComplete(
    var vkSid: String,
    var secret: String,
    var comment: String? = null
) : VkMethod<Complete>("leads.complete", jacksonTypeRef()),
    UserServiceMethod
