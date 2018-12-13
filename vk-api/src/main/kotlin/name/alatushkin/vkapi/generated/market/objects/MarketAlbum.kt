package name.alatushkin.vkapi.generated.market.objects

import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

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
