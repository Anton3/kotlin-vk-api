@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.audio.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.BoolInt
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
    val duration: Int,
    val date: VkDate,
    val albumId: Int? = null,
    val lyricsId: Int? = null,
    val genreId: Int? = null,
    val noSearch: BoolInt? = null,
    val isHq: BoolInt? = null,
    override val id: Int,
    override val ownerId: Int,
    override val artist: String,
    override val title: String,
    override val url: String? = null,
    override val accessKey: String? = null
) : Audio, WallPostAttachmentBody, CommentAttachmentBody, MessageAttachmentBody
