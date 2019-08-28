@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

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
    val photo200: String? = null,
    val photo586: String? = null
) : WallPostAttachmentBody
