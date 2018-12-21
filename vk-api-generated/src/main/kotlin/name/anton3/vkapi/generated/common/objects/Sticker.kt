package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.wall.objects.CommentAttachment

/**
 * No description
 *
 * @property stickerId Sticker ID
 * @property productId Collection ID
 * @property images No description
 * @property imagesWithBackground No description
 */
data class Sticker(
    val stickerId: Long? = null,
    val productId: Long? = null,
    val images: List<Image>? = null,
    val imagesWithBackground: List<Image>? = null
) : CommentAttachment,
    MessageAttachment
