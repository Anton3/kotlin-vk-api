package name.alatushkin.api.vk.generated.common.objects

import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment

data class Sticker(
    val stickerId: Long? = null,
    val productId: Long? = null,
    val images: List<Image>? = null,
    val imagesWithBackground: List<Image>? = null
) : CommentAttachment,
    MessageAttachment
