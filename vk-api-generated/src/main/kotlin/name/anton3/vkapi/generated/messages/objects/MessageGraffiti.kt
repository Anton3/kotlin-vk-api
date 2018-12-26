package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

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
    val id: Long? = null,
    val ownerId: Long? = null,
    val url: String? = null,
    val width: Long? = null,
    val height: Long? = null,
    val accessKey: String? = null
) : MessageAttachment
