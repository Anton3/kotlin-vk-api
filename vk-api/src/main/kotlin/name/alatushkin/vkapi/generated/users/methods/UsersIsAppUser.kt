@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/users.isAppUser]
 *
 * Returns information whether a user installed the application.
 *
 * @property userId 
 */
data class UsersIsAppUser(
    var userId: Long? = null
) : VkMethod<BoolInt>(
    "users.isAppUser",
    jacksonTypeRef()
), UserMethod
