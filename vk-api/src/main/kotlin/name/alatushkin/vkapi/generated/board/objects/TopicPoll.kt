package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.polls.objects.Answer

data class TopicPoll(
    val pollId: Long,
    val ownerId: Long,
    val created: Long,
    val isClosed: BoolInt? = null,
    val question: String,
    val votes: String,
    val answerId: Long,
    val answers: List<Answer>
)
