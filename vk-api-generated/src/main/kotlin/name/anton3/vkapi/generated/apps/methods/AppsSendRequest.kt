@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.apps.objects.Type
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.sendRequest]
 *
 * Sends a request to another user in an app that uses VK authorization.
 *
 * @property userId id of the user to send a request
 * @property text request text
 * @property type request type. Values: 'invite' – if the request is sent to a user who does not have the app installed,, 'request' – if a user has already installed the app
 * @property name No description
 * @property key special string key to be sent with the request
 * @property separate No description
 */
data class AppsSendRequest(
    var userId: Int,
    var text: String? = null,
    var type: Type? = null,
    var name: String? = null,
    var key: String? = null,
    var separate: Boolean? = null
) : VkMethod<Int>("apps.sendRequest", jacksonTypeRef()),
    UserMethod
