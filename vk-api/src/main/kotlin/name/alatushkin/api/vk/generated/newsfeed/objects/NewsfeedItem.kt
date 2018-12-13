package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.vktypes.VkDate

interface NewsfeedItem {
    val type: NewsfeedItemType?
    val sourceId: Long?
    val date: VkDate?
}
