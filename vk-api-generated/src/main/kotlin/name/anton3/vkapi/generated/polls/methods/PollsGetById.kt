@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.polls.objects.GetByIdNameCase
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/polls.getById]
 *
 * Returns detailed information about a poll by its ID.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property isBoard '1' – poll is in a board, '0' – poll is on a wall. '0' by default.
 * @property pollId Poll ID.
 * @property extended No description
 * @property friendsCount No description
 * @property fields No description
 * @property nameCase No description
 */
data class PollsGetById(
    var ownerId: Int? = null,
    var isBoard: Boolean? = null,
    var pollId: Int,
    var extended: Boolean? = null,
    var friendsCount: Int? = null,
    var fields: List<String>? = null,
    var nameCase: GetByIdNameCase? = null
) : VkMethod<Poll, UserMethod>("polls.getById", jacksonTypeRef())
