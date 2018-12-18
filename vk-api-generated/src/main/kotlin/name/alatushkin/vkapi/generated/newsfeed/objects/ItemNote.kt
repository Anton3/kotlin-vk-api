package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property notes No description
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
data class ItemNote(
    val notes: ItemNoteNotes? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
