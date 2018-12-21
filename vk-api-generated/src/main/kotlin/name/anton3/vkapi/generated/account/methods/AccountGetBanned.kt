@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.tokens.UserMethod
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
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<UserMin>>("account.getBanned", jacksonTypeRef()),
    UserMethod
