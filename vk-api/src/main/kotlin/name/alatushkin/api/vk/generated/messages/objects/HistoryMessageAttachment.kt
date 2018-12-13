package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.audio.objects.AudioFull
import name.alatushkin.api.vk.generated.common.objects.Link
import name.alatushkin.api.vk.generated.docs.objects.Doc
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.generated.video.objects.Video

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
