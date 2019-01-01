package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.generated.polls.objects.Answer

/**
 * No description
 *
 * @property pollId Poll ID
 * @property ownerId Poll owner's ID
 * @property created Date when poll has been created in Unixtime
 * @property isClosed Information whether the poll is closed
 * @property question Poll question
 * @property votes Votes number
 * @property answerId Current user's answer ID
 * @property answers No description
 */
data class TopicPoll(
    val pollId: Int,
    val ownerId: Int,
    val created: Int,
    val isClosed: Boolean? = null,
    val question: String,
    val votes: String,
    val answerId: Int,
    val answers: List<Answer>
)
