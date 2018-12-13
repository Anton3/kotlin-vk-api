package name.alatushkin.vkapi.generated.notes.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.vktypes.VkDate

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
