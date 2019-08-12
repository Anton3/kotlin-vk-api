@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/account.getBanned]
 *
 * Returns a user's blacklist.
 *
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of results to return.
 */
data class AccountGetBanned(
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<UserMin>, UserMethod>("account.getBanned", jacksonTypeRef())
