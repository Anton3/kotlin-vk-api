@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
