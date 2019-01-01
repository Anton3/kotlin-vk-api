package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
@JsonDeserialize(`as` = Void::class)
data class Sticker(
    val stickerId: Int? = null,
    val productId: Int? = null,
    val images: List<Image>? = null,
    val imagesWithBackground: List<Image>? = null
) : CommentAttachment,
    MessageAttachment
