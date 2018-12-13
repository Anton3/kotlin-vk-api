@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.unregisterDevice]
 *
 * Unsubscribes a device from push notifications.
 *
 * @property deviceId Unique device ID.
 */
data class AccountUnregisterDevice(
    var deviceId: String? = null
) : VkMethod<OkResponse>(
    "account.unregisterDevice",
    jacksonTypeRef()
), UserMethod
