@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.audio.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.PropertyExists
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property artist Artist name
 * @property id Audio ID
 * @property title Title
 * @property url URL of mp3 file
 * @property duration Duration in seconds
 * @property date Date when uploaded
 * @property albumId Album ID
 * @property genreId Genre ID
 * @property performer Performer name
 * @property ownerId Owner user_id
 * @property accessKey Access key for the audio
 * @property lyricsId Lyrics ID
 * @property noSearch No description
 * @property isHq No description
 */
@JsonDeserialize(`as` = Void::class)
data class Audio(
    val artist: String,
    val id: Int,
    val title: String,
    val url: String? = null,
    val duration: Int,
    val date: VkDate? = null,
    val albumId: Int? = null,
    val genreId: Int? = null,
    val performer: String? = null,
    val ownerId: Int,
    val accessKey: String? = null,
    val lyricsId: Int? = null,
    val noSearch: PropertyExists? = null,
    val isHq: PropertyExists? = null
) : CommentAttachmentBody, WallPostAttachmentBody, MessageAttachmentBody
