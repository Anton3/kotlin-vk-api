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
@JsonDeserialize(`as` = Void::class)
data class AudioImpl(
    override val id: Int,
    override val ownerId: Int,
    override val artist: String,
    override val title: String,
    override val url: String? = null,
    override val accessKey: String? = null
) : Audio
