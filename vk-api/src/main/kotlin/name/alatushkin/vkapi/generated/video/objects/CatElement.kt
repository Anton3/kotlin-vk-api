package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.vktypes.VkDate

data class CatElement(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val type: CatElementType,
    val description: String? = null,
    val duration: Long? = null,
    val photo130: String? = null,
    val photo160: String? = null,
    val photo320: String? = null,
    val photo640: String? = null,
    val photo800: String? = null,
    val date: VkDate? = null,
    val views: Long? = null,
    val comments: Long? = null,
    val canAdd: BoolInt? = null,
    val canEdit: BoolInt? = null,
    val isPrivate: BoolInt? = null,
    val count: Long? = null,
    val updatedTime: Long? = null
)
