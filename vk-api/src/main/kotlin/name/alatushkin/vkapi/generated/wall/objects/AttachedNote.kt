package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
