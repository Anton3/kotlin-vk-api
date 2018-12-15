@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
