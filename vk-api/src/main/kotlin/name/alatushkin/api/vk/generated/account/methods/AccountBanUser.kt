@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.banUser]
 *
 * Adds user to the banlist.
 *
 * @property userId User ID.
 */
data class AccountBanUser(
    var userId: Long
) : VkMethod<OkResponse>(
    "account.banUser",
    jacksonTypeRef()
), UserMethod
