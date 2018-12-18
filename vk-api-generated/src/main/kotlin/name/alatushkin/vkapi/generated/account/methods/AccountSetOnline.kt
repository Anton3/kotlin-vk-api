@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
