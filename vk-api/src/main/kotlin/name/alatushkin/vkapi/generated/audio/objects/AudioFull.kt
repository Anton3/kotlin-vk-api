package name.alatushkin.vkapi.generated.audio.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.vktypes.VkDate

data class AudioFull(
    val duration: Long,
    val date: VkDate,
    val albumId: Long? = null,
    val lyricsId: Long? = null,
    val genreId: Long? = null,
    val noSearch: BoolInt? = null,
    val isHq: BoolInt? = null,
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
