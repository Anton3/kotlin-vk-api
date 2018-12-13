package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Likes
import name.alatushkin.vkapi.generated.common.objects.ObjectCount
import name.alatushkin.vkapi.generated.photos.objects.Image
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.vktypes.VkDate

data class NewsfeedPhoto(
    val likes: Likes? = null,
    val comments: ObjectCount? = null,
    val canComment: BoolInt? = null,
    val canRepost: BoolInt? = null,
    override val id: Long,
    override val albumId: Long,
    override val ownerId: Long,
    override val userId: Long? = null,
    override val sizes: List<Image>? = null,
    override val postId: Long? = null,
    override val width: Long? = null,
    override val height: Long? = null,
    override val text: String? = null,
    override val date: VkDate,
    override val lat: Double? = null,
    override val long: Double? = null,
    override val accessKey: String? = null
) : Photo
