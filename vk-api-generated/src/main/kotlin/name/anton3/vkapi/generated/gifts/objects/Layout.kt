@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.gifts.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody

/**
 * No description
 *
 * @property id Gift ID
 * @property thumb256 URL of the preview image with 256 px in width
 * @property thumb48 URL of the preview image with 48 px in width
 * @property thumb96 URL of the preview image with 96 px in width
 */
@JsonDeserialize(`as` = Void::class)
data class Layout(
    val id: Int? = null,
    @get:JsonProperty("thumb_256") val thumb256: String? = null,
    @get:JsonProperty("thumb_48") val thumb48: String? = null,
    @get:JsonProperty("thumb_96") val thumb96: String? = null
) : MessageAttachmentBody
