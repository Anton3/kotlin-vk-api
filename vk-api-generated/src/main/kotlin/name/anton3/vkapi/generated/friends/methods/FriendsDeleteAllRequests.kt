@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.deleteAllRequests]
 *
 * Marks all incoming friend requests as viewed.
 *

 */
class FriendsDeleteAllRequests : CheckedMethod<OkResponse, UserMethod>("friends.deleteAllRequests", jacksonTypeRef())
