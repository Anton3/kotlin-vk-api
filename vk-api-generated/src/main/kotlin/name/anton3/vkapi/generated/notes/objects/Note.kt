@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.objects

import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property readComments No description
 * @property canComment No description
 * @property comments Comments number
 * @property date Date when the note has been created in Unixtime
 * @property id Note ID
 * @property ownerId Note owner's ID
 * @property text Note text
 * @property textWiki Note text in wiki format
 * @property title Note title
 * @property viewUrl URL of the page with note preview
 */
data class Note(
    val readComments: Int? = null,
    val canComment: BoolInt? = null,
    val comments: Int,
    val date: VkDate,
    val id: Int,
    val ownerId: Int,
    val text: String? = null,
    val textWiki: String? = null,
    val title: String,
    val viewUrl: String
)
