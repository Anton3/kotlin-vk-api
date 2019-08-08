@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.account.objects.PushSettings
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/account.getPushSettings]
 *
 * Gets settings of push notifications.
 *
 * @property deviceId Unique device ID.
 */
data class AccountGetPushSettings(
    var deviceId: String? = null
) : VkMethod<PushSettings>("account.getPushSettings", jacksonTypeRef()),
    UserMethod
