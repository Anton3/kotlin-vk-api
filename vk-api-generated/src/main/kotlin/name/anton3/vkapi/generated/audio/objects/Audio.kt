package name.anton3.vkapi.generated.audio.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id Audio ID
 * @property ownerId Audio owner's ID
 * @property artist Artist name
 * @property title Title
 * @property url URL of mp3 file
 * @property accessKey Access key for the audio
 */
@JsonDeserialize(`as` = AudioImpl::class)
interface Audio {
    val id: Long
    val ownerId: Long
    val artist: String
    val title: String
    val url: String?
    val accessKey: String?
}
