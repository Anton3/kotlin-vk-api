@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.docs.objects.SaveDocBody

/**
 * No description
 *
 * @property accessKey Access key for audio message
 * @property duration Audio message duration in seconds
 * @property id Audio message ID
 * @property linkMp3 MP3 file URL
 * @property linkOgg OGG file URL
 * @property ownerId Audio message owner ID
 * @property waveform No description
 */
@JsonDeserialize(`as` = Void::class)
data class AudioMessage(
    val accessKey: String? = null,
    val duration: Int,
    val id: Int,
    val linkMp3: String,
    val linkOgg: String,
    val ownerId: Int,
    val waveform: List<Int>
) : SaveDocBody, MessageAttachmentBody
