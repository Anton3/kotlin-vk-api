@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.getById]
 *
 * Returns detailed information about a poll by its ID.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property isBoard '1' – poll is in a board, '0' – poll is on a wall. '0' by default.
 * @property pollId Poll ID.
 */
data class PollsGetById(
    var ownerId: Long? = null,
    var isBoard: Boolean? = null,
    var pollId: Long
) : VkMethod<Poll>("polls.getById", jacksonTypeRef()),
    UserMethod
