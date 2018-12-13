package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.PropertyExists
import name.alatushkin.vkapi.vktypes.VkDate

data class VideoImpl(
    override val id: Long? = null,
    override val ownerId: Long? = null,
    override val title: String? = null,
    override val duration: Long? = null,
    override val description: String? = null,
    override val date: VkDate? = null,
    override val views: Long? = null,
    override val comments: Long? = null,
    override val photo130: String? = null,
    override val photo320: String? = null,
    override val photo640: String? = null,
    override val photo800: String? = null,
    override val accessKey: String? = null,
    override val addingDate: Long? = null,
    override val player: String? = null,
    override val canEdit: BoolInt? = null,
    override val canAdd: BoolInt? = null,
    override val processing: PropertyExists? = null,
    override val live: PropertyExists? = null,
    override val files: VideoFiles? = null,
    override val platform: String? = null,
    override val width: Long? = null,
    override val height: Long? = null
) : Video
