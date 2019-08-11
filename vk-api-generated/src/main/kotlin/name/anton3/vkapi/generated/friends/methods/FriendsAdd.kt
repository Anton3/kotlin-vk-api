@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.friends.responses.AddResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/friends.add]
 *
 * Approves or creates a friend request.
 *
 * @property userId ID of the user whose friend request will be approved or to whom a friend request will be sent.
 * @property text Text of the message (up to 500 characters) for the friend request, if any.
 * @property follow '1' to pass an incoming request to followers list.
 */
data class FriendsAdd(
    var userId: Int,
    var text: String? = null,
    var follow: Boolean? = null
) : CheckedMethod<AddResponse, UserMethod>("friends.add", jacksonTypeRef())
