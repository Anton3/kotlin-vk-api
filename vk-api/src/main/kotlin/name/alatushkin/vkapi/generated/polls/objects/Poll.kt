package name.alatushkin.vkapi.generated.polls.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

data class Poll(
    val id: Long,
    val ownerId: Long,
    val created: Long,
    val question: String,
    val votes: String,
    val answerId: Long,
    val answers: List<Answer>,
    val anonymous: BoolInt
) : WallpostAttachment
