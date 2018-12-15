@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.removeUser]
 *
 * Removes a profile from user faves.
 *
 * @property userId Profile ID.
 */
data class FaveRemoveUser(
    var userId: Long
) : VkMethod<OkResponse>("fave.removeUser", jacksonTypeRef()),
    UserMethod
