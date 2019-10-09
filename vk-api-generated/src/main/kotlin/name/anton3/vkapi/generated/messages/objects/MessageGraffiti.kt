@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.docs.objects.SaveDocBody

/**
 * No description
 *
 * @property id No description
 * @property ownerId No description
 * @property url No description
 * @property width No description
 * @property height No description
 * @property accessKey No description
 */
@JsonDeserialize(`as` = Void::class)
data class MessageGraffiti(
    val id: Int? = null,
    val ownerId: Int? = null,
    val url: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val accessKey: String? = null
) : MessageAttachmentBody, SaveDocBody
