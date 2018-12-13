package name.alatushkin.vkapi.generated.common.objects

import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment

data class Sticker(
    val stickerId: Long? = null,
    val productId: Long? = null,
    val images: List<Image>? = null,
    val imagesWithBackground: List<Image>? = null
) : CommentAttachment,
    MessageAttachment
