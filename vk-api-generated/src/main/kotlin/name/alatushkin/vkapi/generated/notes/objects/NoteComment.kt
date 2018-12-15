package name.alatushkin.vkapi.generated.notes.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
    val id: Long,
    val uid: Long,
    val nid: Long,
    val oid: Long,
    val date: VkDate,
    val message: String,
    val replyTo: Long? = null
)
