@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.deleteAllRequests]
 *
 * Marks all incoming friend requests as viewed.
 *

 */
class FriendsDeleteAllRequests : VkMethod<OkResponse>("friends.deleteAllRequests", jacksonTypeRef()),
    UserMethod