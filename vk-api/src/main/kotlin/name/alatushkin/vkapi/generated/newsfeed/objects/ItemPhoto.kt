package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.vktypes.VkDate

data class ItemPhoto(
    val photos: ItemPhotoPhotos? = null,
    val postId: Long? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
