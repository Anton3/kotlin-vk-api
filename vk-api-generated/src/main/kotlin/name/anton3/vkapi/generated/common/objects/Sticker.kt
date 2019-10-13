@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody

/**
 * No description
 *
 * @property images No description
 * @property imagesWithBackground No description
 * @property productId Collection ID
 * @property stickerId Sticker ID
 */
@JsonDeserialize(`as` = Void::class)
data class Sticker(
    val images: List<Image>? = null,
    val imagesWithBackground: List<Image>? = null,
    val productId: Int? = null,
    val stickerId: Int? = null
) : CommentAttachmentBody, MessageAttachmentBody
