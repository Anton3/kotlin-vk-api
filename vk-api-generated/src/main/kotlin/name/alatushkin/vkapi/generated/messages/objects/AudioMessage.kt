package name.anton3.vkapi.generated.messages.objects

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
data class AudioMessage(
    val id: Long,
    val ownerId: Long,
    val duration: Long,
    val linkOgg: String,
    val linkMp3: String,
    val accessKey: String,
    val waveform: List<Long>
) : MessageAttachment
