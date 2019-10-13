@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.common.objects.Link
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.video.objects.Video

/**
 * No description
 *
 * @property audio No description
 * @property audioMessage No description
 * @property doc No description
 * @property graffiti No description
 * @property link No description
 * @property market No description
 * @property photo No description
 * @property share No description
 * @property type No description
 * @property video No description
 * @property wall No description
 */
data class HistoryMessageAttachment(
    val audio: Audio? = null,
    val audioMessage: AudioMessage? = null,
    val doc: Doc? = null,
    val graffiti: Graffiti? = null,
    val link: Link? = null,
    val market: Link? = null,
    val photo: Photo? = null,
    val share: Link? = null,
    val type: HistoryMessageAttachmentType,
    val video: Video? = null,
    val wall: Link? = null
)
