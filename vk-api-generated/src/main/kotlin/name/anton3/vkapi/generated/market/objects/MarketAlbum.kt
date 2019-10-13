@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody

/**
 * No description
 *
 * @property count Items number
 * @property id Market album ID
 * @property ownerId Market album owner's ID
 * @property photo No description
 * @property title Market album title
 * @property updatedTime Date when album has been updated last time in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class MarketAlbum(
    val count: Int,
    val id: Int,
    val ownerId: Int,
    val photo: Photo? = null,
    val title: String,
    val updatedTime: Int
) : CommentAttachmentBody, WallPostAttachmentBody, MessageAttachmentBody
