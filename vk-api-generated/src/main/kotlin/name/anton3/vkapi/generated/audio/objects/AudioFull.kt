package name.anton3.vkapi.generated.audio.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property duration Duration in seconds
 * @property date Date when uploaded
 * @property albumId Album ID
 * @property lyricsId Lyrics ID
 * @property genreId Genre ID
 * @property noSearch Information whether the audio is hidden from search
 * @property isHq No description
 * @property id Audio ID
 * @property ownerId Audio owner's ID
 * @property artist Artist name
 * @property title Title
 * @property url URL of mp3 file
 * @property accessKey Access key for the audio
 */
@JsonDeserialize(`as` = Void::class)
data class AudioFull(
    val duration: Long,
    val date: VkDate,
    val albumId: Long? = null,
    val lyricsId: Long? = null,
    val genreId: Long? = null,
    val noSearch: Boolean? = null,
    val isHq: Boolean? = null,
    override val id: Long,
    override val ownerId: Long,
    override val artist: String,
    override val title: String,
    override val url: String? = null,
    override val accessKey: String? = null
) : Audio,
    WallpostAttachment,
    CommentAttachment,
    MessageAttachment
