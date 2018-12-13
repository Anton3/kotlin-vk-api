package name.alatushkin.vkapi.generated.notes.objects

import name.alatushkin.vkapi.vktypes.VkDate

data class NoteComment(
    val id: Long,
    val uid: Long,
    val nid: Long,
    val oid: Long,
    val date: VkDate,
    val message: String,
    val replyTo: Long? = null
)
