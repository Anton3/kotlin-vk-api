@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property photosList No description
 */
@JsonDeserialize(`as` = Void::class)
data class WallPostAttachmentBodyPhotosList(
    val photosList: List<String>? = null
) : WallPostAttachmentBody
