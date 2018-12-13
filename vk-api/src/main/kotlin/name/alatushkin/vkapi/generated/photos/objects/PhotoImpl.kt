package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.vktypes.VkDate

data class PhotoImpl(
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
