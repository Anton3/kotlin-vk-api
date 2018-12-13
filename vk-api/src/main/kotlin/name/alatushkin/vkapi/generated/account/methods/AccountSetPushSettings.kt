@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setPushSettings]
 *
 * Change push settings.
 *
 * @property deviceId Unique device ID.
 * @property settings Push settings in a [vk.com/dev/push_settings|special format].
 * @property key Notification key.
 * @property value New value for the key in a [vk.com/dev/push_settings|special format].
 */
data class AccountSetPushSettings(
    var deviceId: String,
    var settings: String? = null,
    var key: String? = null,
    var value: List<String>? = null
) : VkMethod<OkResponse>(
    "account.setPushSettings",
    jacksonTypeRef()
), UserMethod
