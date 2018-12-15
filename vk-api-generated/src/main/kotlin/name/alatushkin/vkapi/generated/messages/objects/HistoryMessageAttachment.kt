package name.alatushkin.vkapi.generated.messages.objects

import name.alatushkin.vkapi.generated.audio.objects.AudioFull
import name.alatushkin.vkapi.generated.common.objects.Link
import name.alatushkin.vkapi.generated.docs.objects.Doc
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.video.objects.Video

/**
 * No description
 *
 * @property type No description
 * @property photo No description
 * @property video No description
 * @property audio No description
 * @property doc No description
 * @property link No description
 * @property market No description
 * @property wall No description
 * @property share No description
 */
data class HistoryMessageAttachment(
    val type: HistoryMessageAttachmentType,
    val photo: Photo? = null,
    val video: Video? = null,
    val audio: AudioFull? = null,
    val doc: Doc? = null,
    val link: Link? = null,
    val market: Link? = null,
    val wall: Link? = null,
    val share: Link? = null
)
