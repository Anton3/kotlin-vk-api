package name.alatushkin.api.vk.generated.market.objects

import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment

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
