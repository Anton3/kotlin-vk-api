@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
