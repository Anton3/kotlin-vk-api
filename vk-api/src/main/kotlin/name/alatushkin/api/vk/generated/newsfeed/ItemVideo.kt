package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.api.VkDate

open class ItemVideo(
    val video: ItemVideoVideo? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
