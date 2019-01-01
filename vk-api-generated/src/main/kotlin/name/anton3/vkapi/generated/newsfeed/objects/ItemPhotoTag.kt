package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property photoTags No description
 * @property postId Post ID
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class ItemPhotoTag(
    val photoTags: ItemPhotoTagPhotoTags? = null,
    val postId: Int? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Int? = null,
    override val date: VkDate? = null
) : NewsfeedItem
