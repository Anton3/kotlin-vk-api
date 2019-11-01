@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.generated.polls.objects.Answer
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property answerId Current user's answer ID
 * @property answers No description
 * @property created Date when poll has been created in Unixtime
 * @property isClosed Information whether the poll is closed
 * @property ownerId Poll owner's ID
 * @property pollId Poll ID
 * @property question Poll question
 * @property votes Votes number
 */
data class TopicPoll(
    val answerId: Int,
    val answers: List<Answer>,
    val created: Int,
    val isClosed: BoolInt? = null,
    val ownerId: Int,
    val pollId: Int,
    val question: String,
    val votes: String
)
