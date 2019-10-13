@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.docs.objects.SaveDocBody

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
    val id: Int,
    val ownerId: Int,
    val duration: Int,
    val linkOgg: String,
    val linkMp3: String,
    val accessKey: String,
    val waveform: List<Int>
) : SaveDocBody, MessageAttachmentBody
