package name.alatushkin.api.vk.generated.polls.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment

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
