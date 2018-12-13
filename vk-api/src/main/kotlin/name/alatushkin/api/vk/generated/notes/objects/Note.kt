package name.alatushkin.api.vk.generated.notes.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.vktypes.VkDate

data class Note(
    val id: Long,
    val ownerId: Long,
    val comments: Long,
    val canComment: BoolInt? = null,
    val date: VkDate,
    val title: String,
    val text: String? = null,
    val textWiki: String? = null,
    val viewUrl: String
)
