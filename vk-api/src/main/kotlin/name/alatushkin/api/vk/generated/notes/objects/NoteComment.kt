package name.alatushkin.api.vk.generated.notes.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class NoteComment(
    val id: Long,
    val uid: Long,
    val nid: Long,
    val oid: Long,
    val date: VkDate,
    val message: String,
    val replyTo: Long? = null
)
