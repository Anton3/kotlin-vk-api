package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.vktypes.VkDate

data class NewsfeedItemImpl(
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
