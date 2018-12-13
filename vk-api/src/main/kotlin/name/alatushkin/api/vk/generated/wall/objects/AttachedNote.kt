package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class AttachedNote(
    val id: Long,
    val ownerId: Long,
    val comments: Long,
    val readComments: Long,
    val date: VkDate,
    val title: String,
    val viewUrl: String
) : WallpostAttachment,
    CommentAttachment
