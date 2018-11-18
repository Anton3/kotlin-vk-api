package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.api.VkDate

open class ItemPhotoTag(
    val photoTags: ItemPhotoTagPhotoTags? = null,
    val postId: Long? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem