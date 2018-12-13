package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Likes
import name.alatushkin.vkapi.generated.common.objects.ObjectCount
import name.alatushkin.vkapi.generated.common.objects.PropertyExists
import name.alatushkin.vkapi.vktypes.VkDate

data class PhotoFullXtrRealOffset(
    val id: Long,
    val albumId: Long,
    val ownerId: Long,
    val userId: Long? = null,
    val sizes: List<PhotoSizes>? = null,
    val photo75: String? = null,
    val photo130: String? = null,
    val photo604: String? = null,
    val photo807: String? = null,
    val photo1280: String? = null,
    val photo2560: String? = null,
    val postId: Long? = null,
    val width: Long? = null,
    val height: Long? = null,
    val text: String? = null,
    val date: VkDate,
    val lat: Double? = null,
    val long: Double? = null,
    val accessKey: String? = null,
    val likes: Likes? = null,
    val reposts: ObjectCount? = null,
    val comments: ObjectCount? = null,
    val canComment: BoolInt? = null,
    val tags: ObjectCount? = null,
    val hidden: PropertyExists? = null,
    val realOffset: Long? = null
)
