@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.unbanUser]
 *
 * Deletes user from the blacklist.
 *
 * @property userId User ID.
 */
data class AccountUnbanUser(
    var userId: Long
) : VkMethod<OkResponse>(
    "account.unbanUser",
    jacksonTypeRef()
), UserMethod
