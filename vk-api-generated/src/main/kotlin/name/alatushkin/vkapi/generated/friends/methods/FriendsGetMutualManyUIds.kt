@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.friends.objects.MutualFriend
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getMutual]
 *
 * Returns a list of user IDs of the mutual friends of two users.
 *
 * @property sourceUid ID of the user whose friends will be checked against the friends of the user specified in 'target_uid'.
 * @property targetUid ID of the user whose friends will be checked against the friends of the user specified in 'source_uid'.
 * @property targetUids IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
 * @property order Sort order: 'random' — random order
 * @property count Number of mutual friends to return.
 * @property offset Offset needed to return a specific subset of mutual friends.
 */
data class FriendsGetMutualManyUIds(
    var sourceUid: Long? = null,
    var targetUid: Long? = null,
    var targetUids: List<Long>? = null,
    var order: String? = null,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<List<MutualFriend>>("friends.getMutual", jacksonTypeRef()),
    UserMethod
