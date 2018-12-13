@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.addVote]
 *
 * Adds the current user's vote to the selected answer in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerId Answer ID.
 * @property isBoard 
 */
data class PollsAddVote(
    var ownerId: Long? = null,
    var pollId: Long,
    var answerId: Long,
    var isBoard: Boolean? = null
) : VkMethod<BoolInt>(
    "polls.addVote",
    jacksonTypeRef()
), UserMethod
