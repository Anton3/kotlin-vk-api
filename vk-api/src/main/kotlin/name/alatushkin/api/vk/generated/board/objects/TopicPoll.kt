package name.alatushkin.api.vk.generated.board.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.polls.objects.Answer

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
