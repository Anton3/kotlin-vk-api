package name.alatushkin.vkapi.generated.audio.objects

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
data class AudioImpl(
    override val id: Long,
    override val ownerId: Long,
    override val artist: String,
    override val title: String,
    override val url: String? = null,
    override val accessKey: String? = null
) : Audio