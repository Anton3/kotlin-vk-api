@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.BoolInt

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
 * @property anonymous No description
 */
@JsonDeserialize(`as` = Void::class)
data class Poll(
    val id: Int,
    val ownerId: Int,
    val created: Int,
    val question: String,
    val votes: String,
    val answerId: Int? = null,
    val answers: List<Answer>,
    val anonymous: BoolInt
) : WallPostAttachmentBody, MessageAttachmentBody
