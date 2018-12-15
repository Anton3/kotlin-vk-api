@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

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
    var ownerId: Long? = null,
    var pollId: Long,
    var answerId: Long,
    var isBoard: Boolean? = null
) : VkMethod<Boolean>("polls.deleteVote", jacksonTypeRef()),
    UserMethod
