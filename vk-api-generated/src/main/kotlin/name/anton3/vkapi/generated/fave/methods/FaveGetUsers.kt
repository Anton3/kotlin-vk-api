@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getUsers]
 *
 * Returns a list of users whom the current user has bookmarked.
 *
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 */
data class FaveGetUsers(
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<UserMin>>("fave.getUsers", jacksonTypeRef()),
    UserMethod
