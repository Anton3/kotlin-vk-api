@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.account.objects.AccountCounters
import name.alatushkin.api.vk.tokens.UserMethod

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
