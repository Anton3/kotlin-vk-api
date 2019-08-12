@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

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
) : VkMethod<OkResponse, UserMethod>("account.setPushSettings", jacksonTypeRef())
