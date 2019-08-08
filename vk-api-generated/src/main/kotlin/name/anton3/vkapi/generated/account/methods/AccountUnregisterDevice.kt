@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.unregisterDevice]
 *
 * Unsubscribes a device from push notifications.
 *
 * @property deviceId Unique device ID.
 */
data class AccountUnregisterDevice(
    var deviceId: String? = null
) : VkMethod<OkResponse>("account.unregisterDevice", jacksonTypeRef()),
    UserMethod
