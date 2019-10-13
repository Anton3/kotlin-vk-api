@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.registerDevice]
 *
 * Subscribes an iOS/Android/Windows Phone-based device to receive push notifications
 *
 * @property token Device token used to send notifications. (for mpns, the token shall be URL for sending of notifications)
 * @property deviceModel String name of device model.
 * @property deviceYear Device year.
 * @property deviceId Unique device ID.
 * @property systemVersion String version of device operating system.
 * @property settings Push settings in a [vk.com/dev/push_settings|special format].
 * @property sandbox No description
 */
data class AccountRegisterDevice(
    var token: String,
    var deviceModel: String? = null,
    var deviceYear: Int? = null,
    var deviceId: String,
    var systemVersion: String? = null,
    var settings: String? = null,
    var sandbox: Boolean? = null
) : VkMethod<OkResponse, UserMethod>("account.registerDevice", jacksonTypeRef())
