@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.account.objects.PushSettings
import name.alatushkin.vkapi.tokens.UserMethod

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
