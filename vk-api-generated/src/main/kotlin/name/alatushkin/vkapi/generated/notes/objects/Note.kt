package name.alatushkin.vkapi.generated.notes.objects

import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Note ID
 * @property ownerId Note owner's ID
 * @property comments Comments number
 * @property canComment Information whether current user can comment the note
 * @property date Date when the note has been created in Unixtime
 * @property title Note title
 * @property text Note text
 * @property textWiki Note text in wiki format
 * @property viewUrl URL of the page with note preview
 */
data class Note(
    val id: Long,
    val ownerId: Long,
    val comments: Long,
    val canComment: Boolean? = null,
    val date: VkDate,
    val title: String,
    val text: String? = null,
    val textWiki: String? = null,
    val viewUrl: String
)
