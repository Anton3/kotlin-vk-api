@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addUser]
 *
 * Adds a profile to user faves.
 *
 * @property userId Profile ID.
 */
data class FaveAddUser(
    var userId: Long
) : VkMethod<OkResponse>("fave.addUser", jacksonTypeRef()),
    UserMethod
