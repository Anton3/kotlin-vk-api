@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.account.objects.AccountCounters
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getCounters]
 *
 * Returns non-null values of user counters.
 *
 * @property filter Counters to be returned.
 */
data class AccountGetCounters(
    var filter: List<String>? = null
) : VkMethod<AccountCounters>(
    "account.getCounters",
    jacksonTypeRef()
), UserMethod
