package name.alatushkin.api.vk.generated.video.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.vktypes.VkDate

data class VideoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val viewed: BoolInt
)
