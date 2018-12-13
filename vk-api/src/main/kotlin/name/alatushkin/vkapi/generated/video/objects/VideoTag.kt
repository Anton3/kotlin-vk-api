package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.vktypes.VkDate

data class VideoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val viewed: BoolInt
)
