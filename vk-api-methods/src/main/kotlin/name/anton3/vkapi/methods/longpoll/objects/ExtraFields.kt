package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonFormat
import name.anton3.vkapi.vktypes.VkDate

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
data class ExtraFields(
    val peerId: Long?,
    val timestamp: VkDate?,
    val text: String?,
    val randomId: Long?,
    val title: String?,
    val fromId: Long?,
    val attachments: Attachments
)
