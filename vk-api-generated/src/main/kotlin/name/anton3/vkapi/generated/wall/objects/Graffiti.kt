@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id Graffiti ID
 * @property ownerId Graffiti owner's ID
 * @property photo200 URL of the preview image with 200 px in width
 * @property photo586 URL of the preview image with 586 px in width
 */
@JsonDeserialize(`as` = Void::class)
data class Graffiti(
    val id: Int? = null,
    val ownerId: Int? = null,
    @get:JsonProperty("photo_200") val photo200: String? = null,
    @get:JsonProperty("photo_586") val photo586: String? = null
) : WallPostAttachmentBody
