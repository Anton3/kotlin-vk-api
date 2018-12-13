@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getAppPermissions]
 *
 * Gets settings of the user in this application.
 *
 * @property userId User ID whose settings information shall be got. By default: current user.
 */
data class AccountGetAppPermissions(
    var userId: Long
) : VkMethod<Long>(
    "account.getAppPermissions",
    jacksonTypeRef()
), UserMethod
