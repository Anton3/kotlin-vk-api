@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/polls.addVote]
 *
 * Adds the current user's vote to the selected answer in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerIds No description
 * @property isBoard No description
 */
data class PollsAddVote(
    var ownerId: Int? = null,
    var pollId: Int,
    var answerIds: List<Int>,
    var isBoard: Boolean? = null
) : VkMethod<BoolInt, UserMethod>("polls.addVote", jacksonTypeRef())
