@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.apps.objects.Type
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.sendRequest]
 *
 * Sends a request to another user in an app that uses VK authorization.
 *
 * @property userId id of the user to send a request
 * @property text request text
 * @property type request type. Values: 'invite' – if the request is sent to a user who does not have the app installed,, 'request' – if a user has already installed the app
 * @property name 
 * @property key special string key to be sent with the request
 * @property separate 
 */
data class AppsSendRequest(
    var userId: Long,
    var text: String? = null,
    var type: Type? = null,
    var name: String? = null,
    var key: String? = null,
    var separate: Boolean? = null
) : VkMethod<Long>(
    "apps.sendRequest",
    jacksonTypeRef()
), UserMethod
