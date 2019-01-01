package name.anton3.vkapi.generated.gifts.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachment

/**
 * No description
 *
 * @property id Gift ID
 * @property thumb256 URL of the preview image with 256 px in width
 * @property thumb96 URL of the preview image with 96 px in width
 * @property thumb48 URL of the preview image with 48 px in width
 */
@JsonDeserialize(`as` = Void::class)
data class Layout(
    val id: Int? = null,
    val thumb256: String? = null,
    val thumb96: String? = null,
    val thumb48: String? = null
) : MessageAttachment
