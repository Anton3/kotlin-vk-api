@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Comment ID
 * @property uid Comment author's ID
 * @property nid Note ID
 * @property oid Note ID
 * @property date Date when the comment has beed added in Unixtime
 * @property message Comment text
 * @property replyTo ID of replied comment
 */
data class NoteComment(
    val id: Int,
    val uid: Int,
    val nid: Int,
    val oid: Int,
    val date: VkDate,
    val message: String,
    val replyTo: Int? = null
)
