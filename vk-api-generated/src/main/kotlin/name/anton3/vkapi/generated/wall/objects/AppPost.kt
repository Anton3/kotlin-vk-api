@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id Application ID
 * @property name Application name
 * @property photo130 URL of the preview image with 130 px in width
 * @property photo604 URL of the preview image with 604 px in width
 */
@JsonDeserialize(`as` = Void::class)
data class AppPost(
    val id: Int? = null,
    val name: String? = null,
    val photo130: String? = null,
    val photo604: String? = null
) : WallPostAttachmentBody
