package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.vktypes.VkDate

data class PhotoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val x: Double,
    val y: Double,
    val x2: Double,
    val y2: Double,
    val viewed: BoolInt
)
