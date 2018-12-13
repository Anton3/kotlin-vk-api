package name.alatushkin.api.vk.generated.audio.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment
import name.alatushkin.api.vk.vktypes.VkDate

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
