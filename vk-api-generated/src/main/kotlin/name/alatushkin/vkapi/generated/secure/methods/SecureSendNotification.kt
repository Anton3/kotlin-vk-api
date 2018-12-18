@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.sendNotification]
 *
 * Sends notification to the user.
 *
 * @property userIds No description
 * @property userId No description
 * @property message notification text which should be sent in 'UTF-8' encoding ('254' characters maximum).
 */
data class SecureSendNotification(
    var userIds: List<Long>? = null,
    var userId: Long? = null,
    var message: String
) : VkMethod<List<Long>>("secure.sendNotification", jacksonTypeRef()),
    ServiceMethod
