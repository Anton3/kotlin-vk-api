package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class ItemNote(
    val notes: ItemNoteNotes? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
