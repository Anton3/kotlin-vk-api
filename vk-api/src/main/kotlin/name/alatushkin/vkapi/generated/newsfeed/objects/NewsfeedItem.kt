package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.vktypes.VkDate

interface NewsfeedItem {
    val type: NewsfeedItemType?
    val sourceId: Long?
    val date: VkDate?
}
