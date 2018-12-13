package name.alatushkin.api.vk.generated.video.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.Likes
import name.alatushkin.api.vk.generated.common.objects.PropertyExists
import name.alatushkin.api.vk.vktypes.VkDate

data class VideoFull(
    val id: Long? = null,
    val ownerId: Long? = null,
    val title: String? = null,
    val duration: Long? = null,
    val description: String? = null,
    val date: VkDate? = null,
    val views: Long? = null,
    val comments: Long? = null,
    val photo130: String? = null,
    val photo320: String? = null,
    val photo800: String? = null,
    val accessKey: String? = null,
    val addingDate: Long? = null,
    val player: String? = null,
    val canEdit: BoolInt? = null,
    val canAdd: BoolInt? = null,
    val processing: PropertyExists? = null,
    val live: PropertyExists? = null,
    val files: VideoFiles? = null,
    val privacyView: List<String>? = null,
    val privacyComment: List<String>? = null,
    val canComment: BoolInt? = null,
    val canRepost: BoolInt? = null,
    val likes: Likes? = null,
    val repeat: BoolInt? = null
)
