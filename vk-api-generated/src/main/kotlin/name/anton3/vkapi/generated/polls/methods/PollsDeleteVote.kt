@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/polls.deleteVote]
 *
 * Deletes the current user's vote from the selected answer in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerId Answer ID.
 * @property isBoard No description
 */
data class PollsDeleteVote(
    var ownerId: Int? = null,
    var pollId: Int,
    var answerId: Int,
    var isBoard: Boolean? = null
) : CheckedMethod<Boolean, UserMethod>("polls.deleteVote", jacksonTypeRef())
