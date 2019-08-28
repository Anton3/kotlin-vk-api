@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Note ID
 * @property ownerId Note owner's ID
 * @property comments Comments number
 * @property readComments Read comments number
 * @property date Date when the note has been created in Unixtime
 * @property title Note title
 * @property viewUrl URL of the page with note preview
 */
@JsonDeserialize(`as` = Void::class)
data class AttachedNote(
    val id: Int,
    val ownerId: Int,
    val comments: Int,
    val readComments: Int,
    val date: VkDate,
    val title: String,
    val viewUrl: String
) : WallPostAttachmentBody, CommentAttachmentBody
