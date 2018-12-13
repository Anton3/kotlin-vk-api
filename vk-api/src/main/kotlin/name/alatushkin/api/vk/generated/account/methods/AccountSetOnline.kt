@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setOnline]
 *
 * Marks the current user as online for 15 minutes.
 *
 * @property voip '1' if videocalls are available for current device.
 */
data class AccountSetOnline(
    var voip: Boolean? = null
) : VkMethod<OkResponse>(
    "account.setOnline",
    jacksonTypeRef()
), UserMethod
