@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.setOnline]
 *
 * Marks the current user as online for 15 minutes.
 *
 * @property voip '1' if videocalls are available for current device.
 */
data class AccountSetOnline(
    var voip: Boolean? = null
) : VkMethod<OkResponse>("account.setOnline", jacksonTypeRef()),
    UserMethod
