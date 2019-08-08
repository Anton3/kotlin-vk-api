@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/secure.sendSMSNotification]
 *
 * Sends 'SMS' notification to a user's mobile device.
 *
 * @property userId ID of the user to whom SMS notification is sent. The user shall allow the application to send him/her notifications (, +1).
 * @property message 'SMS' text to be sent in 'UTF-8' encoding. Only Latin letters and numbers are allowed. Maximum size is '160' characters.
 */
data class SecureSendSMSNotification(
    var userId: Int,
    var message: String
) : VkMethod<OkResponse>("secure.sendSMSNotification", jacksonTypeRef()),
    ServiceMethod
