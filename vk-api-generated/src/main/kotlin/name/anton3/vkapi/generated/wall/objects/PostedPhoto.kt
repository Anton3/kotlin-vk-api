@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id Photo ID
 * @property ownerId Photo owner's ID
 * @property photo130 URL of the preview image with 130 px in width
 * @property photo604 URL of the preview image with 604 px in width
 */
@JsonDeserialize(`as` = Void::class)
data class PostedPhoto(
    val id: Int? = null,
    val ownerId: Int? = null,
    @get:JsonProperty("photo_130") val photo130: String? = null,
    @get:JsonProperty("photo_604") val photo604: String? = null
) : WallPostAttachmentBody
