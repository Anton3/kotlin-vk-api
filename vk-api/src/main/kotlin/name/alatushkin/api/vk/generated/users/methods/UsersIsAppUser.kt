@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserMethod

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
