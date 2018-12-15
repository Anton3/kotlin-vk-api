package name.alatushkin.vkapi.generated.market.objects

import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

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
