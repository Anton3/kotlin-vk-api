@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Date when the comment has beed added in Unixtime
 * @property id Comment ID
 * @property message Comment text
 * @property nid Note ID
 * @property oid Note ID
 * @property replyTo ID of replied comment
 * @property uid Comment author's ID
 */
data class NoteComment(
    val date: VkDate,
    val id: Int,
    val message: String,
    val nid: Int,
    val oid: Int,
    val replyTo: Int? = null,
    val uid: Int
)
