@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.VkMethod

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
    var userIds: List<Int>? = null,
    var userId: Int? = null,
    var message: String
) : VkMethod<List<Int>, ServiceMethod>("secure.sendNotification", jacksonTypeRef())
