package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id No description
 * @property ownerId No description
 * @property duration No description
 * @property linkOgg No description
 * @property linkMp3 No description
 * @property accessKey No description
 * @property waveform No description
 */
@JsonDeserialize(`as` = Void::class)
data class AudioMessage(
    val id: Long,
    val ownerId: Long,
    val duration: Long,
    val linkOgg: String,
    val linkMp3: String,
    val accessKey: String,
    val waveform: List<Long>
) : MessageAttachment
