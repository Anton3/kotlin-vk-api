@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.account.objects.AccountCounters
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/account.getCounters]
 *
 * Returns non-null values of user counters.
 *
 * @property filter Counters to be returned.
 */
data class AccountGetCounters(
    var filter: List<String>? = null
) : VkMethod<AccountCounters, UserMethod>("account.getCounters", jacksonTypeRef())
