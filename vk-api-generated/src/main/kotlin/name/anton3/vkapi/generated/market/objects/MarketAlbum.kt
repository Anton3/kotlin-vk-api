package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment

/**
 * No description
 *
 * @property id Market album ID
 * @property ownerId Market album owner's ID
 * @property title Market album title
 * @property count Items number
 * @property updatedTime Date when album has been updated last time in Unixtime
 * @property photo No description
 */
@JsonDeserialize(`as` = Void::class)
data class MarketAlbum(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val count: Long,
    val updatedTime: Long,
    val photo: Photo? = null
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment
