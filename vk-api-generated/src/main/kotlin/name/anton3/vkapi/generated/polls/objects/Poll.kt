package name.anton3.vkapi.generated.polls.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment

/**
 * No description
 *
 * @property id Poll ID
 * @property ownerId Poll owner's ID
 * @property created Date when poll has been created in Unixtime
 * @property question Poll question
 * @property votes Votes number
 * @property answerId Current user's answer ID
 * @property answers No description
 * @property anonymous Information whether the pole is anonymous
 */
@JsonDeserialize(`as` = Void::class)
data class Poll(
    val id: Long,
    val ownerId: Long,
    val created: Long,
    val question: String,
    val votes: String,
    val answerId: Long,
    val answers: List<Answer>,
    val anonymous: Boolean
) : WallpostAttachment
