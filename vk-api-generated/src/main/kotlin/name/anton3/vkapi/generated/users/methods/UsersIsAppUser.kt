@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/users.isAppUser]
 *
 * Returns information whether a user installed the application.
 *
 * @property userId No description
 */
data class UsersIsAppUser(
    var userId: Int? = null
) : VkMethod<Boolean>("users.isAppUser", jacksonTypeRef()),
    UserMethod
