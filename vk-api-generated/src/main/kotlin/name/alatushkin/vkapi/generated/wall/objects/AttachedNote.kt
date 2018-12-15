package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
data class AttachedNote(
    val id: Long,
    val ownerId: Long,
    val comments: Long,
    val readComments: Long,
    val date: VkDate,
    val title: String,
    val viewUrl: String
) : WallpostAttachment,
    CommentAttachment
