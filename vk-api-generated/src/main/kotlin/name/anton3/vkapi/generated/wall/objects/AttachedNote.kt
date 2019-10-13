@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property comments Comments number
 * @property date Date when the note has been created in Unixtime
 * @property id Note ID
 * @property ownerId Note owner's ID
 * @property readComments Read comments number
 * @property title Note title
 * @property viewUrl URL of the page with note preview
 */
@JsonDeserialize(`as` = Void::class)
data class AttachedNote(
    val comments: Int,
    val date: VkDate,
    val id: Int,
    val ownerId: Int,
    val readComments: Int,
    val title: String,
    val viewUrl: String
) : CommentAttachmentBody, WallPostAttachmentBody
